package com.example.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectdemo.entity.AbstractUser;
import com.example.projectdemo.entity.Address;
@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
