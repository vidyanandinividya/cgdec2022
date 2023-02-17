package com.example.loginlogoutdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginlogoutdemo.entity.AbstractUser;
import com.example.loginlogoutdemo.service.UserService;

@RestController
public class LoginController {
	@Autowired
	private UserService service;
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody AbstractUser user)
	{
		
		
		String userType=service.login(user);
		
		return ResponseEntity.ok(userType);
		
	}

}
