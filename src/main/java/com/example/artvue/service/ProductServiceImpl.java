package com.example.artvue.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.artvue.model.Product;
import com.example.artvue.repository.ProductRepository;

public class ProductServiceImpl {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
