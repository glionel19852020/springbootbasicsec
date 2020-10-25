package com.basic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private static List<User> courses = new ArrayList<>();
	private static long idCounter = 0;

	static {
		courses.add(new User(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and Angular"));
		courses.add(new User(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and React"));
		courses.add(new User(++idCounter, "in28minutes", "Master Microservices with Spring Boot and Spring Cloud"));
		courses.add(new User(++idCounter, "in28minutes",
				"Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
	}

	public List<User> findAll() {
		return courses;
	}

}
