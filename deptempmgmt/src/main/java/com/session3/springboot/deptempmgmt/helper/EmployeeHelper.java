package com.session3.springboot.deptempmgmt.helper;

import com.session3.springboot.deptempmgmt.bean.AddressBean;
import com.session3.springboot.deptempmgmt.bean.DepartmentBean;
import com.session3.springboot.deptempmgmt.bean.EmployeeBean;

import com.session3.springboot.deptempmgmt.entity.Employee;

public class EmployeeHelper {
	
	public static EmployeeBean generateEmployeeBean(Employee emp)
	{
		EmployeeBean employeeBean=null;
		if(emp!=null)
		
			employeeBean=new EmployeeBean(emp);
			if(emp.getDept()!=null)
			
				employeeBean.setDept(new DepartmentBean(emp.getDept()));
			if(emp.getAddress()!=null)
				
				employeeBean.setAddress(new AddressBean(emp.getAddress()));
			
			return employeeBean;
	}
	

}
