package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
	public String ok() {
		return "Welcome to Ashok It...!!";
	}
}
