package com.example.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectdemo.entity.AbstractUser;
@Repository
public interface IuserRepo extends JpaRepository<AbstractUser, Integer> {

}
