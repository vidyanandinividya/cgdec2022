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
import com.example.projectdemo.service.CustomerService;
import com.example.projectdemo.service.UserService;



@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer> customer=customerService.getAllCustomers();
		return ResponseEntity.ok(customer);
	}
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
		return ResponseEntity.ok("Customer Saved");
	}

}
