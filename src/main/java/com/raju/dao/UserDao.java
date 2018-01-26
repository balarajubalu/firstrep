package com.raju.dao;

import java.util.List;

import com.raju.DTO.Loginproperties;
import com.raju.DTO.UserLogin;
import com.raju.model.User;



public interface UserDao {
	public Integer userRegister(User user);
	public List<User> getAllUsers();
	public UserLogin userLogin(Loginproperties loginproperties);
	public List<User> findByName(String name);
}
