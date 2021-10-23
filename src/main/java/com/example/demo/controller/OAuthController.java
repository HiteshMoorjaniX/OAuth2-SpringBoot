package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/restricted")
	public String restricted() {
		return "to see this you need to be logged in";
	}
	
	@GetMapping("/not-restricted")
	public String notRestricted() {
		return "you can see this without get logged in";
	}
}
