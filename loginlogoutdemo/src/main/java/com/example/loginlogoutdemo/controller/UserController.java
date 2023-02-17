package com.example.loginlogoutdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginlogoutdemo.entity.AbstractUser;
import com.example.loginlogoutdemo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody AbstractUser user)
	{
		userService.addUser(user);
		return ResponseEntity.ok("user Saved");
	}

}
