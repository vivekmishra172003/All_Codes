package com.dealsapp.deal.service;

import com.dealsapp.deal.dto.PriceCalculationRequest;
import com.dealsapp.deal.dto.PriceCalculationResponse;

public interface PriceCalculationService {
    PriceCalculationResponse calculatePrice(PriceCalculationRequest request);
}