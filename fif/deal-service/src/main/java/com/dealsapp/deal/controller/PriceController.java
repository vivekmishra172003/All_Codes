package com.dealsapp.deal.controller;

import com.dealsapp.deal.dto.PriceCalculationRequest;
import com.dealsapp.deal.dto.PriceCalculationResponse;
import com.dealsapp.deal.service.PriceCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deals")
public class PriceController {

    @Autowired
    private PriceCalculationService priceCalculationService;

    @PostMapping("/calculate-price")
    public ResponseEntity<PriceCalculationResponse> calculatePrice(@RequestBody PriceCalculationRequest request) {
        try {
            PriceCalculationResponse response = priceCalculationService.calculatePrice(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            PriceCalculationResponse errorResponse = new PriceCalculationResponse(
                    null, null, null, null, null, null, false, e.getMessage()
            );
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }
}