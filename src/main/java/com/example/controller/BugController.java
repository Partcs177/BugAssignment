package com.example.controller;

import java.util.Optional;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IBugService;
import com.example.entity.ProjectBug;



@RestController
public class BugController {
	@Autowired
	IBugService userService;

	@GetMapping("/bug")
	Iterable<ProjectBug> getBug() {
		return userService.getUsers();
	}
	
	@GetMapping("/bug/{id}")
	Optional<ProjectBug> getBug(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}

	@PostMapping("/bug") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createUser(@RequestBody @Valid ProjectBug bug) {
	
		userService.saveBug(bug);
	}
}
