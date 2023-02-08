package com.example.projectdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.repository.IuserRepo;

@Service
public class UserService {
	@Autowired
	private IuserRepo repo;
	public List<AbstractUser> getAllUsers()
	{
		return repo.findAll();
	}
	public AbstractUser addUser(Customer user)
	{
		
		
		return repo.save(user);
	}
	

}
