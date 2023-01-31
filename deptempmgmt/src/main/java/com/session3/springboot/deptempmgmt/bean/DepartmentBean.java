package com.session3.springboot.deptempmgmt.bean;

import com.session3.springboot.deptempmgmt.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentBean {

	private Integer departmentId;
	private String departmentName;
	private String departmentHead;
	public DepartmentBean(Department department) {
		departmentId=department.getDepartmentId();
		departmentName=department.getDepartmentName();
		departmentHead=department.getDepartmentHead();
	}

}
