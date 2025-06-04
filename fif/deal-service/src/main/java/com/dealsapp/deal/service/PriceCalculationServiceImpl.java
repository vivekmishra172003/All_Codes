package com.dealsapp.deal.service;

import com.dealsapp.deal.dto.PriceCalculationRequest;
import com.dealsapp.deal.dto.PriceCalculationResponse;
import com.dealsapp.deal.entity.Deal;
import com.dealsapp.deal.feign.CouponServiceClient;
import com.dealsapp.deal.feign.UserServiceClient;
import com.dealsapp.deal.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class PriceCalculationServiceImpl implements PriceCalculationService {

    @Autowired
    private DealRepository dealRepository;

    @Autowired
    private UserServiceClient userServiceClient;

    @Autowired
    private CouponServiceClient couponServiceClient;

    @Override
    public PriceCalculationResponse calculatePrice(PriceCalculationRequest request) {
        try {
            // Validate user
            UserServiceClient.UserValidationResponse user = userServiceClient.validateUser(request.getUserId());
            if (user == null) {
                return new PriceCalculationResponse(null, null, null, null, null, null, false, "Invalid user");
            }

            // Get deal
            Deal deal = dealRepository.findById(request.getDealId())
                    .orElseThrow(() -> new RuntimeException("Deal not found"));

            // Validate coupon
            CouponServiceClient.CouponValidationRequest couponRequest = 
                    new CouponServiceClient.CouponValidationRequest(request.getUserId(), request.getCouponId());
            
            CouponServiceClient.CouponValidationResponse couponResponse = 
                    couponServiceClient.validateCoupon(couponRequest);

            if (!couponResponse.isValid()) {
                return new PriceCalculationResponse(
                        deal.getTitle(),
                        deal.getOriginalPrice(),
                        null,
                        null,
                        null,
                        deal.getOriginalPrice(),
                        false,
                        couponResponse.getMessage()
                );
            }

            // Calculate discount
            BigDecimal originalPrice = deal.getOriginalPrice();
            BigDecimal discountPercentage = new BigDecimal(couponResponse.getDiscountPercentage());
            BigDecimal discountAmount = originalPrice.multiply(discountPercentage).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
            BigDecimal finalPrice = originalPrice.subtract(discountAmount);

            // Use coupon (increment usage count)
            CouponServiceClient.CouponUsageRequest usageRequest = 
                    new CouponServiceClient.CouponUsageRequest(request.getUserId(), request.getCouponId());
            couponServiceClient.useCoupon(usageRequest);

            return new PriceCalculationResponse(
                    deal.getTitle(),
                    originalPrice,
                    couponResponse.getCouponCode(),
                    couponResponse.getDiscountPercentage(),
                    discountAmount,
                    finalPrice,
                    true,
                    "Price calculated successfully"
            );

        } catch (Exception e) {
            return new PriceCalculationResponse(null, null, null, null, null, null, false, e.getMessage());
        }
    }
}