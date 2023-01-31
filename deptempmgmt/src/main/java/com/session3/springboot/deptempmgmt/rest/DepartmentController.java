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
import org.springframework.web.bind.annotation.RestController;

import com.session3.springboot.deptempmgmt.bean.DepartmentBean;

import com.session3.springboot.deptempmgmt.entity.Department;
import com.session3.springboot.deptempmgmt.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/getAllDepartments")
	public ResponseEntity<List<DepartmentBean>> findAllDepartments()
	{
		List<DepartmentBean> depts=departmentService.findAllDepartments();
		return ResponseEntity.ok(depts);
	}
	@GetMapping("department/{deptid}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable("deptid") int deptid)
	{
		Department deptRetrieved=departmentService.findDepartmentById(deptid);
		return ResponseEntity.ok(deptRetrieved);
	}
	@PostMapping("/addDepartment")
	public ResponseEntity<String> addDepartment(@RequestBody Department dept)
	{
		departmentService.addDepartment(dept);
		return ResponseEntity.ok("Department Saved");
	}
	@PutMapping("/updateDepartment")
	public ResponseEntity<String> updateDepartment(@RequestBody Department dept)
	{
		departmentService.addDepartment(dept);
		return ResponseEntity.ok("Department Updated");
	}
	@PutMapping("/delete/{deptid}")
	public ResponseEntity<Void> deleteDepartment(@PathVariable("deptid") int deptid)
	{
		departmentService.deleteDepartmentById(deptid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}
