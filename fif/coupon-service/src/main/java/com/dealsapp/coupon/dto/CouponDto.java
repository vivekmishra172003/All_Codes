package com.dealsapp.coupon.dto;

public class CouponDto {
    private Long id;
    private String code;
    private Integer discountPercentage;
    private Integer remainingUses;

    // Constructors
    public CouponDto() {}

    public CouponDto(Long id, String code, Integer discountPercentage, Integer remainingUses) {
        this.id = id;
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.remainingUses = remainingUses;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    
    public Integer getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(Integer discountPercentage) { this.discountPercentage = discountPercentage; }
    
    public Integer getRemainingUses() { return remainingUses; }
    public void setRemainingUses(Integer remainingUses) { this.remainingUses = remainingUses; }
}