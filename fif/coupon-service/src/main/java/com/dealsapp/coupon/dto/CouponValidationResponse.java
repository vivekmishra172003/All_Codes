package com.dealsapp.coupon.dto;

public class CouponValidationResponse {
    private boolean valid;
    private String couponCode;
    private Integer discountPercentage;
    private String message;

    // Constructors
    public CouponValidationResponse() {}

    public CouponValidationResponse(boolean valid, String couponCode, Integer discountPercentage, String message) {
        this.valid = valid;
        this.couponCode = couponCode;
        this.discountPercentage = discountPercentage;
        this.message = message;
    }

    // Getters and Setters
    public boolean isValid() { return valid; }
    public void setValid(boolean valid) { this.valid = valid; }
    
    public String getCouponCode() { return couponCode; }
    public void setCouponCode(String couponCode) { this.couponCode = couponCode; }
    
    public Integer getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(Integer discountPercentage) { this.discountPercentage = discountPercentage; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}