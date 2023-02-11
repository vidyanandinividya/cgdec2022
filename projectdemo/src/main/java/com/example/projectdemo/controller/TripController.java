package com.example.projectdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectdemo.bean.TripBookingBean;
import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.entity.TripBooking;
import com.example.projectdemo.service.TripBookingService;
import com.example.projectdemo.service.UserService;



@RestController
public class TripController {
	@Autowired
	private TripBookingService tripBookingService;
	
	@GetMapping("/getAllTrips")
	public ResponseEntity<List<TripBookingBean>> getAllTrips()
	{
		List<TripBookingBean> trip=tripBookingService.getAllTrips();
		return ResponseEntity.ok(trip);
	}
	@PostMapping("/addTrips")
	public ResponseEntity<String> addTrip(@RequestBody TripBooking trip)
	{
		tripBookingService.saveTrip(trip);
		return ResponseEntity.ok("Trip Saved");
	}

}
