package com.rjxy.dao;

import com.rjxy.bean.User;

public interface UserDao {
	public User login(User user);
	public void addUser(User user);
}
