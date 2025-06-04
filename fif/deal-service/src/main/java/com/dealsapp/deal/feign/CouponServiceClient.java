package com.dealsapp.deal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "coupon-service")
public interface CouponServiceClient {
    
    @PostMapping("/api/coupons/validate")
    CouponValidationResponse validateCoupon(@RequestBody CouponValidationRequest request);
    
    @PostMapping("/api/coupons/use")
    void useCoupon(@RequestBody CouponUsageRequest request);

    class CouponValidationRequest {
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

    class CouponValidationResponse {
        private boolean valid;
        private String couponCode;
        private Integer discountPercentage;
        private String message;

        // Constructors
        public CouponValidationResponse() {}

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

    class CouponUsageRequest {
        private Long userId;
        private Long couponId;

        // Constructors
        public CouponUsageRequest() {}

        public CouponUsageRequest(Long userId, Long couponId) {
            this.userId = userId;
            this.couponId = couponId;
        }

        // Getters and Setters
        public Long getUserId() { return userId; }
        public void setUserId(Long userId) { this.userId = userId; }
        
        public Long getCouponId() { return couponId; }
        public void setCouponId(Long couponId) { this.couponId = couponId; }
    }
}