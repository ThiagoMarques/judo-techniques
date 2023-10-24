package com.thiagomarques.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagomarques.domain.model.JudoThrow;

@Repository
public interface JudoThrowRepository extends JpaRepository<JudoThrow, Long>{
    // boolean existsByThrow(String throwName);
    
}
