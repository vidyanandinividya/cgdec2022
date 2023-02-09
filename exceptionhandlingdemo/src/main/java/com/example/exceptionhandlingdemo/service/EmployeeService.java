package com.example.exceptionhandlingdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exceptionhandlingdemo.entity.Employee;
import com.example.exceptionhandlingdemo.exception.EmptyInputException;
import com.example.exceptionhandlingdemo.repository.EmployeeCrudRepo;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeCrudRepo crudRepo;
	
	public List<Employee> getAllEmployees()
	{
		return crudRepo.findAll();
	}
	public Employee addEmployee(Employee employee)
	{
		if(employee.getName().isEmpty()|| employee.getName().length()==0)
		{
			throw new EmptyInputException();
		}
		
		return crudRepo.save(employee);
	}
	public Optional<Employee> findEmployeeById(Long id)
	{
		return crudRepo.findById(id);
	}
	public void deleteEmployeeById(Long empId)
	{
		crudRepo.deleteById(empId);
	}

}
