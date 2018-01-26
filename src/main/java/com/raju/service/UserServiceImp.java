package com.raju.service;




import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.DTO.Loginproperties;
import com.raju.DTO.UserLogin;
import com.raju.dao.UserDao;
import com.raju.model.User;

@Service
public class UserServiceImp implements UserService{
	public static final Logger logger=Logger.getLogger(UserServiceImp.class.getName());

@Autowired	
private UserDao dao;

public String userRegister(User userbean) {
	String msg="not registered..";
	
	 Integer count=dao.userRegister(userbean);
	
	 if(count>0) {
			msg="Registration succes...";
		}else {
			msg="registration failed please try again."; 
		}
	return msg;
}

public List<User> getAllUsers() {
	 
	
	return dao.getAllUsers();
}


public UserLogin userLogin(Loginproperties loginproperties) {
	UserLogin userLogin=dao.userLogin(loginproperties);
	return userLogin;
}

public List<User> findByName(String name) {
	// TODO Auto-generated method stub
	return null;
}



/*

if(count>=0) {
	
		logger.info(" from logger info user registration is succes..... ");
		//System.out.println("user registration is succes");
	}
	

 * 	public String sayHello(String name) {
	
		return dao.sayHello(name);
	}
	
 * */
	

}
