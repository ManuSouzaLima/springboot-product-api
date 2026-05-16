package com.emanuel.desafio_durotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emanuel.desafio_durotech.entity.Product;
import com.emanuel.desafio_durotech.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }
    
    public List<Product> create(Product product) {
        productRepository.save(product);
        return list();
    }

    public List<Product> list() {
        return productRepository.findAll();
    }

    public List<Product> update(Product product) {
        productRepository.save(product);
        return list();
    }

    public List<Product> delete(Product product) {
        productRepository.delete(product);
        return list();
    }
}
