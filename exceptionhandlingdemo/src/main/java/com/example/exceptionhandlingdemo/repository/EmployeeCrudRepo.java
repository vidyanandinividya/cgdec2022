package com.example.exceptionhandlingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exceptionhandlingdemo.entity.Employee;
@Repository
public interface EmployeeCrudRepo  extends JpaRepository<Employee, Long>{

}
