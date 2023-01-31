package com.session3.springboot.deptempmgmt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;

@Entity
@Table
@Transactional
@Data
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer departmentId;
	private String departmentName;
	private String departmentHead;
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private List<Employee> employees;
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentHead="
				+ departmentHead + "]";
	}
	
	
	

}
