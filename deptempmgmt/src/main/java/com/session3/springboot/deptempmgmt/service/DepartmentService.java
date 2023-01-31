package com.session3.springboot.deptempmgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session3.springboot.deptempmgmt.bean.DepartmentBean;
import com.session3.springboot.deptempmgmt.entity.Department;
import com.session3.springboot.deptempmgmt.repository.DepartmentServiceInt;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentServiceInt departmentService;
	
	public List<DepartmentBean> findAllDepartments()
	{
		List<Department> deptList= departmentService.findAll();
		List<DepartmentBean> beanList=new ArrayList<>();
		deptList.stream().
		forEach(dept->beanList.add(new DepartmentBean(dept)));
		return beanList;
	}
	public Department addDepartment(Department dept)
	{
		return departmentService.save(dept);
	}
	public Department findDepartmentById(int id)
	{
		return departmentService.findById(id).get();
	}
	public void deleteDepartmentById(int deptId)
	{
		departmentService.deleteById(deptId);
	}

}
