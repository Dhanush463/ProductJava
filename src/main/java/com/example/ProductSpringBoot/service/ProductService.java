package com.example.ProductSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductSpringBoot.entity.Product;
import com.example.ProductSpringBoot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public Product addNewProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}
	
	public Optional<Product> getProductById(Integer id) {
		return productRepo.findById(id);
	}
	
	public Product updateExistProduct(Product product,Integer id) {
		return productRepo.save(product);
	}
	
	public void deleteProductById(Integer id) {
		productRepo.deleteById(id);
	}
	
	public Product getProductNameById(String productname) {
		return productRepo.findByProductname(productname).orElse(null);
	}
}
