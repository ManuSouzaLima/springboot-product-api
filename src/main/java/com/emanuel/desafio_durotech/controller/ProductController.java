package com.emanuel.desafio_durotech.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuel.desafio_durotech.entity.Product;
import com.emanuel.desafio_durotech.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public List <Product> create(@RequestBody Product product)
    {
        return productService.create(product);
    }

    @GetMapping
    public List <Product> list()
    {
        return productService.list();
    }

    @PutMapping
    public List <Product> update(@RequestBody Product product)
    {
        return productService.update(product);
    }
    
    @DeleteMapping
    public List <Product> delete(@RequestBody long id)
    {
        return productService.delete(id);
    }

}
