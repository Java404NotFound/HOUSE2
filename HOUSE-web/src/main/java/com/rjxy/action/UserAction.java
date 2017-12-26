package com.rjxy.action;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rjxy.bean.User;
import com.rjxy.service.UserService;

public class UserAction extends ActionSupport {

	private User user;

	public void login() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		UserService userService = (UserService) ac.getBean("userService");
		User user2 = userService.login(user);

		String str = "false";
		if (user2 != null) {
			ActionContext.getContext().getSession().put("Users", user2);
			str = user2.getUsername()+"欢迎你";
		}
		try {
			ServletActionContext.getResponse().setHeader("Content-type", "text/html;charset=UTF-8");
			ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
			ServletActionContext.getResponse().getWriter().write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String register() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		UserService userService = (UserService) ac.getBean("userService");
		user.setIsadmin("n");
		String string = UUID.randomUUID().toString();
		user.setId(string);
		userService.saveUser(user);
		return "yes";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
