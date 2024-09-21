package com.springboot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to Spring Boot Project with Docker";
	}
	
	@GetMapping("/greet/{name}")
	public String getGreetMessage(@PathVariable("name") String name) {
		return "Good Morning ...! How are you "+name+" ?";
	}
}
