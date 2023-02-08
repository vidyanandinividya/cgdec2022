package com.example.projectdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.service.AddressService;
import com.example.projectdemo.service.UserService;



@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getAddress")
	public ResponseEntity<List<Address>> getAddress()
	{
		List<Address> address=addressService.getAllAddress();
		return ResponseEntity.ok(address);
	}
	@PostMapping("/addAddress")
	public ResponseEntity<String> addAddress(@RequestBody Address address)
	{
		addressService.addAddress(address);
		return ResponseEntity.ok("Address Saved");
	}

}
