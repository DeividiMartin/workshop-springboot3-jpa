package com.projetospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.course.entities.Product;
import com.projetospring.course.repositories.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repostory; 
	public List<Product> findAll(){
		return repostory.findAll();
	}
	 public Product findById(Long id) {
		Optional<Product> obj = repostory.findById(id);
		return obj.get();
	 }
}
