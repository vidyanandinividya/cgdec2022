package com.session3.springboot.deptempmgmt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.session3.springboot.deptempmgmt.bean.EmployeeBean;
import com.session3.springboot.deptempmgmt.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<EmployeeBean>> findAllEmployees()
	{
		List<EmployeeBean> employees=employeeService.findAllEmployees();
		return ResponseEntity.ok(employees);
	}
	@GetMapping("employee/{empid}")
	public ResponseEntity<EmployeeBean> findEmployeeById(@PathVariable("empid") int empid)
	{
		EmployeeBean empRetrieved=employeeService.findEmployeeById(empid);
		return ResponseEntity.ok(empRetrieved);
	}
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeBean emp)
	{
		employeeService.addEmployee(emp);
		return ResponseEntity.ok("Employee Saved");
	}
	@PutMapping("/updateEmployee")
	public ResponseEntity<String> updateEmployee(@RequestBody EmployeeBean emp)
	{
		employeeService.addEmployee(emp);
		return ResponseEntity.ok("Employee Updated");
	}
	@PutMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empid") int empid)
	{
		employeeService.deleteEmployeeById(empid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
