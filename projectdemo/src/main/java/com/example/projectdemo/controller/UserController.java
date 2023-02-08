package com.example.projectdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.service.UserService;



@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<AbstractUser>> getAllUserss()
	{
		List<AbstractUser> users=userService.getAllUsers();
		return ResponseEntity.ok(users);
	}
	@PostMapping("/addUsers")
	public ResponseEntity<String> addUser(@RequestBody Customer user)
	{
		userService.addUser(user);
		return ResponseEntity.ok("User Saved");
	}

}
