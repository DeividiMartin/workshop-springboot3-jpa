package com.projetospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.course.entities.Order;
import com.projetospring.course.repositories.OrderRepository;
@Service
public class OrderService {
	@Autowired
	private OrderRepository repostory; 
	public List<Order> findAll(){
		return repostory.findAll();
	}
	 public Order findById(Long id) {
		Optional<Order> obj = repostory.findById(id);
		return obj.get();
	 }
}
