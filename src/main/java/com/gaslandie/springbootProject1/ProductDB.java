package com.gaslandie.springbootProject1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDB extends JpaRepository<Product,Integer> {
    
}