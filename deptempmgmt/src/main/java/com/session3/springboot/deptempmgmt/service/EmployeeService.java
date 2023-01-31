package com.session3.springboot.deptempmgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session3.springboot.deptempmgmt.bean.EmployeeBean;
import com.session3.springboot.deptempmgmt.entity.Employee;
import com.session3.springboot.deptempmgmt.helper.EmployeeHelper;
import com.session3.springboot.deptempmgmt.repository.DepartmentServiceInt;
import com.session3.springboot.deptempmgmt.repository.EmployeeServiceInt;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeServiceInt employeeService;
	
	@Autowired
	private DepartmentServiceInt departmentService;
	
	public List<EmployeeBean> findAllEmployees()
	{
	List<Employee> empList=	employeeService.findAll();
	List<EmployeeBean> beanList=new ArrayList<>();
	empList.stream().forEach(emp->
	beanList.add(EmployeeHelper.generateEmployeeBean(emp)));
	return beanList;
	}
	public Employee addEmployee(EmployeeBean employeeBean)
	{
		Employee emp=new Employee(employeeBean);
		if(employeeBean.getDepartmentId()!=null)
		{
			emp.setDept(departmentService.findById(employeeBean.getDepartmentId()).get());
		}
		return employeeService.save(emp);
	}
	public EmployeeBean findEmployeeById(int id)
	{
		return EmployeeHelper.generateEmployeeBean(employeeService.findById(id).get());
	}
	public void deleteEmployeeById(int empId)
	{
		employeeService.deleteById(empId);
	}

}
