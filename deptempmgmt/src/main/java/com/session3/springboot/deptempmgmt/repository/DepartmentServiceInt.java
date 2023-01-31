package com.session3.springboot.deptempmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.session3.springboot.deptempmgmt.entity.Department;

@Repository
public interface DepartmentServiceInt extends JpaRepository<Department, Integer>{

}
