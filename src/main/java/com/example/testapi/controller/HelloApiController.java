package com.example.testapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
	@GetMapping(
			path = "/")
	
	public String StatusCheck() {
		return "Application is working"; 
	}
	
	@GetMapping(
			path = "/hello")
	
	public String HelloWorld() {
		return "Hello World from Java 17"; 
	}
}
