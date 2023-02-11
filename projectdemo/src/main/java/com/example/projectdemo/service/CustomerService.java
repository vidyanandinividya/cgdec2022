package com.example.projectdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.repository.IAddressRepo;
import com.example.projectdemo.repository.ICustomerRepo;
import com.example.projectdemo.repository.IuserRepo;

@Service
public class CustomerService {
	@Autowired
	private ICustomerRepo repo;
	
	@Autowired
	private IAddressRepo addressRepo;
	public List<Customer> getAllCustomers()
	{
		return repo.findAll();
	}
	public Customer addCustomer(Customer customer)
	{
		Address address=addressRepo.findById(customer.getAddress().getAddressid()).get();
		customer.setAddress(address);
		
		return repo.save(customer);
	}
	

}
