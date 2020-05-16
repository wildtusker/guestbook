package com.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDao;
import com.model.Login;
import com.model.User;



public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;
	
  
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		User user=null;//userDao.validateUser(login);
		if(user == null){
			user=new User();
			user.setFirstname("great");
			user.setUsername(login.getUsername());
		}
		return user; 
	}

}
