package com.rjxy.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.rjxy.bean.Type;
import com.rjxy.service.TypeService;

public class TypeAction extends ActionSupport {

	public void findTypeList() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		TypeService typeService = (TypeService) ac.getBean("typeService");
		List<Type> findTypeList = typeService.findTypeList();
		String html = "";
		for (Type type : findTypeList) {
			html += "<option value='" + type.getId() + "'>" + type.getName() + "</option>";
		}

		try {
			ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
			ServletActionContext.getResponse().getWriter().write(html);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
