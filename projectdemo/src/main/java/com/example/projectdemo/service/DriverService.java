package com.example.projectdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.entity.Driver;
import com.example.projectdemo.repository.IAddressRepo;
import com.example.projectdemo.repository.IDriverRepo;
import com.example.projectdemo.repository.IuserRepo;

@Service
public class DriverService {
	@Autowired
	private IDriverRepo repo;
	
	@Autowired
	private IAddressRepo addressRepo;
	public List<Driver> getAllDrivers()
	{
		return repo.findAll();
	}
	public Driver addDriver(Driver driver)
	{
		Address address=addressRepo.findById(driver.getAddress().getAddressid()).get();
		driver.setAddress(address);
		
		return repo.save(driver);
	}
	

}
