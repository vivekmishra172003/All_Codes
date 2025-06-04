package com.dealsapp.coupon.controller;

import com.dealsapp.coupon.dto.CouponDto;
import com.dealsapp.coupon.dto.CouponValidationRequest;
import com.dealsapp.coupon.dto.CouponValidationResponse;
import com.dealsapp.coupon.dto.CouponUsageRequest;
import com.dealsapp.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping
    public ResponseEntity<List<CouponDto>> getAllCoupons() {
        try {
            List<CouponDto> coupons = couponService.getAllActiveCoupons();
            return ResponseEntity.ok(coupons);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<CouponDto>> getAvailableCouponsForUser(@PathVariable Long userId) {
        try {
            List<CouponDto> coupons = couponService.getAvailableCouponsForUser(userId);
            return ResponseEntity.ok(coupons);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CouponDto> getCouponById(@PathVariable Long id) {
        try {
            CouponDto coupon = couponService.getCouponById(id);
            return ResponseEntity.ok(coupon);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/validate")
    public ResponseEntity<CouponValidationResponse> validateCoupon(@RequestBody CouponValidationRequest request) {
        try {
            CouponValidationResponse response = couponService.validateCoupon(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            CouponValidationResponse errorResponse = new CouponValidationResponse(
                    false, null, null, "Validation failed: " + e.getMessage()
            );
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }

    @PostMapping("/use")
    public ResponseEntity<String> useCoupon(@RequestBody CouponUsageRequest request) {
        try {
            couponService.useCoupon(request);
            return ResponseEntity.ok("Coupon used successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to use coupon: " + e.getMessage());
        }
    }
}