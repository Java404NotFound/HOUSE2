package com.rjxy.service;

import com.rjxy.bean.User;

public interface UserService {
	public User login(User user);
	public void saveUser(User user);
}
