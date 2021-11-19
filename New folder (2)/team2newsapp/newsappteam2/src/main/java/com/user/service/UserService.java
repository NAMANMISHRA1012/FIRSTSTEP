package com.user.service;

import java.util.List;

import com.user.model.User;

public interface UserService
{
	public User addUser(User user);
	public User searchUserById(int userId); 
	public boolean deleteUserById(int userId);
	public User updateUser(User user);
	public List<User> getAllUsers();

}
