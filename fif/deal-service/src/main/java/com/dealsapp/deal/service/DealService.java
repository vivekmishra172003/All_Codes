package com.dealsapp.deal.service;

import com.dealsapp.deal.dto.DealDto;
import com.dealsapp.deal.dto.PriceCalculationRequest;
import com.dealsapp.deal.dto.PriceCalculationResponse;

import java.util.List;

public interface DealService {
    List<DealDto> getAllActiveDeals();
    DealDto getDealById(Long id);
    List<DealDto> getDealsByCategory(String category);
}