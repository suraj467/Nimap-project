package com.category.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.category.product.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


    
} 