package com.rjxy.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rjxy.bean.District;
import com.rjxy.bean.Type;
import com.rjxy.service.DistrictService;

public class DistrictAction extends ActionSupport {
	public void findDistrictList() {
		// 准备下拉框信息 房屋位置
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		DistrictService districtService = (DistrictService) ac.getBean("districtService");
		List<District> DistrictList = districtService.findDistrictList();
		String html =  "<option value='0'>城区不限</option>";
		for (District district : DistrictList) {
			html += "<option value='" + district.getId() + "'>" + district.getName() + "</option>";
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
