package com.java.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/jd")
	public String print() {
		return "SPRING BOOT APPLICATION THROUGH JENKINS TO DOCKER...";
	}
}
