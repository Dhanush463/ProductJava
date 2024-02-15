package com.example.ProductSpringBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductSpringBoot.entity.Product;
import com.example.ProductSpringBoot.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService productSer;
	
	@GetMapping("/products")
	List<Product> getAllProduct() {
		return productSer.getAllProduct();
	}
	
	@GetMapping("/product/id/{id}")
	Optional<Product> getProductById(@PathVariable Integer id) {
		return productSer.getProductById(id);
	}
	
	@GetMapping("/product/{prodcutname}")
	Product getProductByProductname(@PathVariable String productname) {
		return productSer.getProductNameById(productname);
	}
	
	@PostMapping("/product/add")
	Product addNewProduct(@RequestBody Product product) {
		return productSer.addNewProduct(product);
	}
	
	@PutMapping("/product/update/{id}")
	Product updateExistProductById(@RequestBody Product product, @PathVariable Integer id) {
		return productSer.updateExistProduct(product,id);
	}
	
	@DeleteMapping("/product/delete/{id}")
	void deleteProductById(@PathVariable Integer id) {
		productSer.deleteProductById(id);
	}
}
