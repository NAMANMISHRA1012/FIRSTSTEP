package com.user.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService
{
	@Autowired
   private UserRepo repo;
	@Override
	public User addUser(User user)
	{
		return repo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}

	@Override
	public boolean deleteUserById(int userId) 
	{
		repo.deleteById(userId);
		return !repo.existsById(userId);
	}

	@Override
	public User searchUserById(int userId) {
		
		return  repo.getById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		
		return repo.findAll();
	}
	
	

}
