package com.vastika.uib.service;

import java.util.List;

import com.vastika.uib.model.User;

public interface UserService {
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(int id);
	
	User getUserById(int id);
	
	List<User> getAllUser();

}
