package com.dealsapp.coupon.service;

import com.dealsapp.coupon.dto.CouponDto;
import com.dealsapp.coupon.dto.CouponValidationRequest;
import com.dealsapp.coupon.dto.CouponValidationResponse;
import com.dealsapp.coupon.dto.CouponUsageRequest;
import com.dealsapp.coupon.entity.Coupon;
import com.dealsapp.coupon.entity.UserCouponUsage;
import com.dealsapp.coupon.feign.UserServiceClient;
import com.dealsapp.coupon.repository.CouponRepository;
import com.dealsapp.coupon.repository.UserCouponUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private UserCouponUsageRepository userCouponUsageRepository;

    @Autowired
    private UserServiceClient userServiceClient;

    @Override
    public List<CouponDto> getAllActiveCoupons() {
        List<Coupon> coupons = couponRepository.findByIsActiveTrue();
        return coupons.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CouponDto> getAvailableCouponsForUser(Long userId) {
        // Validate user first
        try {
            UserServiceClient.UserValidationResponse user = userServiceClient.validateUser(userId);
            if (user == null) {
                throw new RuntimeException("Invalid user");
            }
        } catch (Exception e) {
            throw new RuntimeException("User validation failed");
        }

        List<Coupon> allActiveCoupons = couponRepository.findByIsActiveTrue();
        
        return allActiveCoupons.stream()
                .map(coupon -> {
                    Optional<UserCouponUsage> usage = userCouponUsageRepository
                            .findByUserIdAndCouponId(userId, coupon.getId());
                    
                    int timesUsed = usage.map(UserCouponUsage::getTimesUsed).orElse(0);
                    int remainingUses = coupon.getMaxUsesPerUser() - timesUsed;
                    
                    return new CouponDto(
                            coupon.getId(),
                            coupon.getCode(),
                            coupon.getDiscountPercentage(),
                            Math.max(0, remainingUses)
                    );
                })
                .filter(dto -> dto.getRemainingUses() > 0)
                .collect(Collectors.toList());
    }

    @Override
    public CouponValidationResponse validateCoupon(CouponValidationRequest request) {
        try {
            // Validate user
            UserServiceClient.UserValidationResponse user = userServiceClient.validateUser(request.getUserId());
            if (user == null) {
                return new CouponValidationResponse(false, null, null, "Invalid user");
            }

            // Get coupon
            Optional<Coupon> couponOpt = couponRepository.findById(request.getCouponId());
            if (!couponOpt.isPresent()) {
                return new CouponValidationResponse(false, null, null, "Coupon not found");
            }

            Coupon coupon = couponOpt.get();
            if (!coupon.getIsActive()) {
                return new CouponValidationResponse(false, coupon.getCode(), null, "Coupon is not active");
            }

            // Check usage
            Optional<UserCouponUsage> usageOpt = userCouponUsageRepository
                    .findByUserIdAndCouponId(request.getUserId(), request.getCouponId());
            
            int timesUsed = usageOpt.map(UserCouponUsage::getTimesUsed).orElse(0);
            
            if (timesUsed >= coupon.getMaxUsesPerUser()) {
                return new CouponValidationResponse(
                        false, 
                        coupon.getCode(), 
                        null, 
                        "Coupon usage limit exceeded"
                );
            }

            return new CouponValidationResponse(
                    true,
                    coupon.getCode(),
                    coupon.getDiscountPercentage(),
                    "Coupon is valid"
            );

        } catch (Exception e) {
            return new CouponValidationResponse(false, null, null, "Validation failed: " + e.getMessage());
        }
    }

    @Override
    public void useCoupon(CouponUsageRequest request) {
        try {
            // Validate user
            UserServiceClient.UserValidationResponse user = userServiceClient.validateUser(request.getUserId());
            if (user == null) {
                throw new RuntimeException("Invalid user");
            }

            // Get coupon
            Coupon coupon = couponRepository.findById(request.getCouponId())
                    .orElseThrow(() -> new RuntimeException("Coupon not found"));

            // Get or create usage record
            Optional<UserCouponUsage> usageOpt = userCouponUsageRepository
                    .findByUserIdAndCouponId(request.getUserId(), request.getCouponId());

            UserCouponUsage usage;
            if (usageOpt.isPresent()) {
                usage = usageOpt.get();
                usage.setTimesUsed(usage.getTimesUsed() + 1);
                usage.setLastUsedDate(LocalDateTime.now());
            } else {
                usage = new UserCouponUsage();
                usage.setUserId(request.getUserId());
                usage.setCouponId(request.getCouponId());
                usage.setTimesUsed(1);
                usage.setLastUsedDate(LocalDateTime.now());
            }

            userCouponUsageRepository.save(usage);

        } catch (Exception e) {
            throw new RuntimeException("Failed to record coupon usage: " + e.getMessage());
        }
    }

    @Override
    public CouponDto getCouponById(Long id) {
        Coupon coupon = couponRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Coupon not found"));
        return convertToDto(coupon);
    }

    private CouponDto convertToDto(Coupon coupon) {
        return new CouponDto(
                coupon.getId(),
                coupon.getCode(),
                coupon.getDiscountPercentage(),
                coupon.getMaxUsesPerUser()
        );
    }
}