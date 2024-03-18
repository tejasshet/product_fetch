package com.example.artvue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.artvue.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
