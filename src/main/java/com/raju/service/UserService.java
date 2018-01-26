package com.raju.service;

import java.util.List;

import com.raju.DTO.Loginproperties;
import com.raju.DTO.UserLogin;
import com.raju.model.User;

public interface UserService {
	public String userRegister(User userbean);
	public List<User> getAllUsers(); 
	public UserLogin userLogin(Loginproperties loginproperties);
	public List<User> findByName(String name);
}
