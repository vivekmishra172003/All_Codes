package com.dealsapp.deal.repository;

import com.dealsapp.deal.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository extends JpaRepository<Deal, Long> {
    List<Deal> findByIsActiveTrue();
    List<Deal> findByCategoryAndIsActiveTrue(String category);
}