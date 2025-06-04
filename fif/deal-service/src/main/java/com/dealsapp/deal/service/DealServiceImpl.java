package com.dealsapp.deal.service;

import com.dealsapp.deal.dto.DealDto;
import com.dealsapp.deal.entity.Deal;
import com.dealsapp.deal.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    private DealRepository dealRepository;

    @Override
    public List<DealDto> getAllActiveDeals() {
        List<Deal> deals = dealRepository.findByIsActiveTrue();
        return deals.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public DealDto getDealById(Long id) {
        Deal deal = dealRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Deal not found"));
        return convertToDto(deal);
    }

    @Override
    public List<DealDto> getDealsByCategory(String category) {
        List<Deal> deals = dealRepository.findByCategoryAndIsActiveTrue(category);
        return deals.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private DealDto convertToDto(Deal deal) {
        return new DealDto(
                deal.getId(),
                deal.getTitle(),
                deal.getDescription(),
                deal.getOriginalPrice(),
                deal.getCategory()
        );
    }
}