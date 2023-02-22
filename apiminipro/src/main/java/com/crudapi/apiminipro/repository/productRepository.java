package com.crudapi.apiminipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapi.apiminipro.entity.Product;

public interface productRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
    
}
