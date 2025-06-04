package com.dealsapp.deal.dto;

import java.math.BigDecimal;

public class PriceCalculationResponse {
    private String dealTitle;
    private BigDecimal originalPrice;
    private String couponCode;
    private Integer discountPercentage;
    private BigDecimal discountAmount;
    private BigDecimal finalPrice;
    private boolean success;
    private String message;

    // Constructors
    public PriceCalculationResponse() {}

    public PriceCalculationResponse(String dealTitle, BigDecimal originalPrice, String couponCode, 
                                  Integer discountPercentage, BigDecimal discountAmount, 
                                  BigDecimal finalPrice, boolean success, String message) {
        this.dealTitle = dealTitle;
        this.originalPrice = originalPrice;
        this.couponCode = couponCode;
        this.discountPercentage = discountPercentage;
        this.discountAmount = discountAmount;
        this.finalPrice = finalPrice;
        this.success = success;
        this.message = message;
    }

    // Getters and Setters
    public String getDealTitle() { return dealTitle; }
    public void setDealTitle(String dealTitle) { this.dealTitle = dealTitle; }
    
    public BigDecimal getOriginalPrice() { return originalPrice; }
    public void setOriginalPrice(BigDecimal originalPrice) { this.originalPrice = originalPrice; }
    
    public String getCouponCode() { return couponCode; }
    public void setCouponCode(String couponCode) { this.couponCode = couponCode; }
    
    public Integer getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(Integer discountPercentage) { this.discountPercentage = discountPercentage; }
    
    public BigDecimal getDiscountAmount() { return discountAmount; }
    public void setDiscountAmount(BigDecimal discountAmount) { this.discountAmount = discountAmount; }
    
    public BigDecimal getFinalPrice() { return finalPrice; }
    public void setFinalPrice(BigDecimal finalPrice) { this.finalPrice = finalPrice; }
    
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}