package com.example.projectdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.repository.IAddressRepo;
import com.example.projectdemo.repository.IuserRepo;

@Service
public class AddressService {
	@Autowired
	private IAddressRepo repo;
	public List<Address> getAllAddress()
	{
		return repo.findAll();
	}
	public Address addAddress(Address address)
	{
		
		
		return repo.save(address);
	}
	

}
