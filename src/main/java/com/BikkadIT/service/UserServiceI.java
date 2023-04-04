package com.BikkadIT.service;

import com.BikkadIT.model.CustomerDto;
import com.BikkadIT.model.User;

import java.util.List;

public interface UserServiceI {
	
	public User createUser(User user);
	
	public User login(String username, String password);


}
