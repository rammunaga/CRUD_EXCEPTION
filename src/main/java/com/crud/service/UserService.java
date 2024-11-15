package com.crud.service;

import java.util.List;

import com.crud.entity.User;
import com.crud.exception.UserNotFoundException;

public interface UserService {
	
	
	User getUserById(long id) throws UserNotFoundException;
	
	List<User> getAllUsers();
	
	String deleteUserById(long id);
	
	User updateUser(User user);
	
	User addUser(User user);
	
	List<User> addAllUser(List<User> users);

}
