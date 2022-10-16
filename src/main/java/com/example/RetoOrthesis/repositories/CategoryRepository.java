package com.example.RetoOrthesis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetoOrthesis.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
