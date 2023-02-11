package com.example.projectdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.projectdemo.bean.TripBookingBean;
import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.entity.Driver;
import com.example.projectdemo.entity.TripBooking;
import com.example.projectdemo.repository.IAddressRepo;
import com.example.projectdemo.repository.ICustomerRepo;
import com.example.projectdemo.repository.IDriverRepo;
import com.example.projectdemo.repository.ITripBookingRepo;
import com.example.projectdemo.repository.IuserRepo;

@Service
public class TripBookingService {
	@Autowired
	private ITripBookingRepo repo;
	
	@Autowired
	private ICustomerRepo cutomerRepo;
	
	@Autowired
	private IDriverRepo driverRepo;
	
	public List<TripBookingBean> getAllTrips()
	{
		List<TripBookingBean> returnList = new ArrayList<>();
		repo.findAll().stream().forEach(trip ->{
			returnList.add(new TripBookingBean(trip, true));
		});
		return returnList;
	}
	
	public TripBooking saveTrip(TripBooking trip)
	{
	//	AbstractUser user=userRepo.findById(trip.getUser().getUserId()).get();
	//	trip.setUser(user);
		System.out.println(trip.getCustomer().getUserId());
		Customer customer=	cutomerRepo.findById(trip.getCustomer().getUserId()).get();
		trip.setCustomer(customer);
		Driver driver=	driverRepo.findById(trip.getDriver().getUserId()).get();
		trip.setDriver(driver);
		return repo.save(trip);
	}
	

}
