package com.example.loginlogoutdemo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginlogoutdemo.entity.AbstractUser;

@Repository
public interface UserCrudRepo  extends JpaRepository<AbstractUser,Long>{

	public Optional<AbstractUser> findUserByEmailAndPassword(String email,String password);
}
