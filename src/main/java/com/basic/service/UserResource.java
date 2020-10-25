package com.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;

	@GetMapping("/instructors/{username}/courses")
	public List<User> getAllCourses(@PathVariable String username) {
		return userService.findAll();
	}

}
