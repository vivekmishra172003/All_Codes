package com.dealsapp.deal.dto;

import java.math.BigDecimal;

public class DealDto {
    private Long id;
    private String title;
    private String description;
    private BigDecimal originalPrice;
    private String category;

    // Constructors
    public DealDto() {}

    public DealDto(Long id, String title, String description, BigDecimal originalPrice, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.originalPrice = originalPrice;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public BigDecimal getOriginalPrice() { return originalPrice; }
    public void setOriginalPrice(BigDecimal originalPrice) { this.originalPrice = originalPrice; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}