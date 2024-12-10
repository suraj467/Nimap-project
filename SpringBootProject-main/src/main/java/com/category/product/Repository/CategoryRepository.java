package com.category.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.category.product.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    
} 
