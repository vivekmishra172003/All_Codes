package com.dealsapp.deal.controller;

import com.dealsapp.deal.dto.DealDto;
import com.dealsapp.deal.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deals")
public class DealController {

    @Autowired
    private DealService dealService;

    @GetMapping
    public ResponseEntity<List<DealDto>> getAllDeals() {
        try {
            List<DealDto> deals = dealService.getAllActiveDeals();
            return ResponseEntity.ok(deals);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<DealDto> getDealById(@PathVariable Long id) {
        try {
            DealDto deal = dealService.getDealById(id);
            return ResponseEntity.ok(deal);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<DealDto>> getDealsByCategory(@PathVariable String category) {
        try {
            List<DealDto> deals = dealService.getDealsByCategory(category);
            return ResponseEntity.ok(deals);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}