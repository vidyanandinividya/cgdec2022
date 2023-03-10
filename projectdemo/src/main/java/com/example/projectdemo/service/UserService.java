package com.example.projectdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.repository.IAddressRepo;
import com.example.projectdemo.repository.IuserRepo;

@Service
public class UserService {
	@Autowired
	private IuserRepo repo;
	
	@Autowired
	private IAddressRepo addressRepo;
	public List<AbstractUser> getAllUsers()
	{
		return repo.findAll();
	}
	public AbstractUser addUser(Customer user)
	{
		Address address=addressRepo.findById(user.getAddress().getAddressid()).get();
		user.setAddress(address);
		
		return repo.save(user);
	}
	

}
