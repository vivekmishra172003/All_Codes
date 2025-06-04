package com.dealsapp.coupon.dto;

public class CouponValidationRequest {
    private Long userId;
    private Long couponId;

    // Constructors
    public CouponValidationRequest() {}

    public CouponValidationRequest(Long userId, Long couponId) {
        this.userId = userId;
        this.couponId = couponId;
    }

    // Getters and Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    
    public Long getCouponId() { return couponId; }
    public void setCouponId(Long couponId) { this.couponId = couponId; }
}