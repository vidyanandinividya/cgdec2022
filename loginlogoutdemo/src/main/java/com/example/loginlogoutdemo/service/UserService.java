package com.example.loginlogoutdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.loginlogoutdemo.entity.AbstractUser;
import com.example.loginlogoutdemo.repository.UserCrudRepo;

@Service
public class UserService {
	@Autowired
	private UserCrudRepo crudRepo;
	
	public String login(AbstractUser user)
	{
		Optional<AbstractUser> dbUser=crudRepo.findUserByEmailAndPassword(user.getEmail(), user.getPassword());
		return dbUser != null ? dbUser.get().getUserType() : null;
	}
	public AbstractUser addUser(AbstractUser user)
	{
		
		
		return crudRepo.save(user);
	}

}
