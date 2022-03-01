package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Repository;
import com.example.entity.ProjectBug;



@Service
public class IBugService {
	@Autowired 
	Repository userRepository;
	public void saveBug(ProjectBug bug) {
		userRepository.save(bug);
	}

	public Iterable<ProjectBug> getUsers() {
		return userRepository.findAll();
	}

	public Optional<ProjectBug> getUser(Integer id) {
		return userRepository.findById(id);
	}


}