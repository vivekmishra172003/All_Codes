package com.dealsapp.coupon.service;

import com.dealsapp.coupon.dto.CouponDto;
import com.dealsapp.coupon.dto.CouponValidationRequest;
import com.dealsapp.coupon.dto.CouponValidationResponse;
import com.dealsapp.coupon.dto.CouponUsageRequest;

import java.util.List;

public interface CouponService {
    List<CouponDto> getAllActiveCoupons();
    List<CouponDto> getAvailableCouponsForUser(Long userId);
    CouponValidationResponse validateCoupon(CouponValidationRequest request);
    void useCoupon(CouponUsageRequest request);
    CouponDto getCouponById(Long id);
}