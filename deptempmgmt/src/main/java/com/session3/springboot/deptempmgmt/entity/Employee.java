package com.session3.springboot.deptempmgmt.entity;

import com.session3.springboot.deptempmgmt.bean.EmployeeBean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class Employee {
	public Employee(EmployeeBean empBean)
	{
		employeeId=empBean.getEmployeeId();
		employeeName=empBean.getEmployeeName();
		employeeSalary=empBean.getEmployeeSalary();
		if(empBean.getAddress()!=null)
		{
			address=new Address(empBean.getAddress());
		}
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	@ManyToOne
	@JoinColumn(name="department_Id")
	private Department dept;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	

}
