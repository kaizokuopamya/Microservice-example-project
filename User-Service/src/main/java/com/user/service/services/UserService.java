package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserService {
	List<User> getAllUsers();
	
	User getUser(Long id);
	
	User addUser(User user);
	
	User updateUser(User user);
	
	String deleteUser(User user);
}
