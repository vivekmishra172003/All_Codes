package com.dealsapp.coupon.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_coupon_usage")
public class UserCouponUsage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_id", nullable = false)
    private Long userId;
    
    @Column(name = "coupon_id", nullable = false)
    private Long couponId;
    
    @Column(name = "times_used")
    private Integer timesUsed = 0;
    
    @Column(name = "last_used_date")
    private LocalDateTime lastUsedDate;

    // Constructors
    public UserCouponUsage() {}

    public UserCouponUsage(Long userId, Long couponId, Integer timesUsed, LocalDateTime lastUsedDate) {
        this.userId = userId;
        this.couponId = couponId;
        this.timesUsed = timesUsed;
        this.lastUsedDate = lastUsedDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    
    public Long getCouponId() { return couponId; }
    public void setCouponId(Long couponId) { this.couponId = couponId; }
    
    public Integer getTimesUsed() { return timesUsed; }
    public void setTimesUsed(Integer timesUsed) { this.timesUsed = timesUsed; }
    
    public LocalDateTime getLastUsedDate() { return lastUsedDate; }
    public void setLastUsedDate(LocalDateTime lastUsedDate) { this.lastUsedDate = lastUsedDate; }
}