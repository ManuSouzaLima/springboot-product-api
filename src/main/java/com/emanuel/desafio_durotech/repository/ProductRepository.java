package com.emanuel.desafio_durotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuel.desafio_durotech.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
    
}
