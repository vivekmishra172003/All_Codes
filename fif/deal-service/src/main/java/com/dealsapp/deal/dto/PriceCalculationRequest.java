package com.dealsapp.deal.dto;

public class PriceCalculationRequest {
    private Long userId;
    private Long dealId;
    private Long couponId;

    // Constructors
    public PriceCalculationRequest() {}

    public PriceCalculationRequest(Long userId, Long dealId, Long couponId) {
        this.userId = userId;
        this.dealId = dealId;
        this.couponId = couponId;
    }

    // Getters and Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    
    public Long getDealId() { return dealId; }
    public void setDealId(Long dealId) { this.dealId = dealId; }
    
    public Long getCouponId() { return couponId; }
    public void setCouponId(Long couponId) { this.couponId = couponId; }
}