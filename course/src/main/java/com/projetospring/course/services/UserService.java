package com.projetospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.course.entities.User;
import com.projetospring.course.repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository repostory; 
	public List<User> findAll(){
		return repostory.findAll();
	}
	 public User findById(Long id) {
		Optional<User> obj = repostory.findById(id);
		return obj.get();
	 }
}
