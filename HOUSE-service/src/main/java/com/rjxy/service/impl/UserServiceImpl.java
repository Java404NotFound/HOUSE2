package com.rjxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.rjxy.bean.User;
import com.rjxy.dao.UserDao;

@Component("userService")
public class UserServiceImpl implements com.rjxy.service.UserService {
	@Resource(name = "userDao")
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public void saveUser(User user) {
		userDao.addUser(user);
		
	}
}
