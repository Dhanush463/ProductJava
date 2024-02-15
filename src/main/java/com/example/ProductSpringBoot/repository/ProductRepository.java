package com.example.ProductSpringBoot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductSpringBoot.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Optional<Product> findByProductname(String productname);
}
