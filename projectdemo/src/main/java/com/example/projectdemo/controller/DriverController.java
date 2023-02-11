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
import com.example.projectdemo.entity.Driver;
import com.example.projectdemo.service.CustomerService;
import com.example.projectdemo.service.DriverService;
import com.example.projectdemo.service.UserService;



@RestController
public class DriverController {
	@Autowired
	private DriverService driverService;
	
	@GetMapping("/getAllDrivers")
	public ResponseEntity<List<Driver>> getAllDriver()
	{
		List<Driver> driver=driverService.getAllDrivers();
		return ResponseEntity.ok(driver);
	}
	@PostMapping("/addDriver")
	public ResponseEntity<String> addDriver(@RequestBody Driver driver)
	{
		driverService.addDriver(driver);
		return ResponseEntity.ok("Driver Saved");
	}

}
