package com.example.exceptionhandlingdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptionhandlingdemo.entity.Employee;
import com.example.exceptionhandlingdemo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> employees=employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	@GetMapping("employee/{empid}")
	public ResponseEntity<Optional<Employee>> findEmployeeById(@PathVariable("empid") Long empid)
	{
		Optional<Employee> empRetrieved=employeeService.findEmployeeById(empid);
		return ResponseEntity.ok(empRetrieved);
	}
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp)
	{
		employeeService.addEmployee(emp);
		return ResponseEntity.ok("Employee Saved");
	}
	@PutMapping("/updateEmployee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee emp)
	{
		employeeService.addEmployee(emp);
		return ResponseEntity.ok("Employee Updated");
	}
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empid") Long empid)
	{
		employeeService.deleteEmployeeById(empid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	

}
