package com.session3.springboot.deptempmgmt.bean;
import com.session3.springboot.deptempmgmt.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean {
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	private DepartmentBean dept;
	private AddressBean address;
	private Integer departmentId;
	private Integer addressId;

	public EmployeeBean(Employee employee) {
		
		employeeId=employee.getEmployeeId();
		employeeName=employee.getEmployeeName();
		employeeSalary=employee.getEmployeeSalary();
	}

}
