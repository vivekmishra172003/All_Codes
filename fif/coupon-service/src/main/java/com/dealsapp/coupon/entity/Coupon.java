package com.dealsapp.coupon.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "coupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String code;
    
    @Column(nullable = false)
    private Integer discountPercentage;
    
    @Column(name = "max_uses_per_user")
    private Integer maxUsesPerUser = 1;
    
    @Column(name = "is_active")
    private Boolean isActive = true;

    // Constructors
    public Coupon() {}

    public Coupon(String code, Integer discountPercentage, Integer maxUsesPerUser, Boolean isActive) {
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.maxUsesPerUser = maxUsesPerUser;
        this.isActive = isActive;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    
    public Integer getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(Integer discountPercentage) { this.discountPercentage = discountPercentage; }
    
    public Integer getMaxUsesPerUser() { return maxUsesPerUser; }
    public void setMaxUsesPerUser(Integer maxUsesPerUser) { this.maxUsesPerUser = maxUsesPerUser; }
    
    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }
}