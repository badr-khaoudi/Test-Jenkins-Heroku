package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {
	
	
	@GetMapping("/")
	public String heroku() {
		return("Welcome to heroku Spring Lively Inspheris!!!");
	}

}
