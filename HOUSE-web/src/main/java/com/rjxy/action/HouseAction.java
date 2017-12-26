package com.rjxy.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rjxy.bean.District;
import com.rjxy.bean.House;
import com.rjxy.bean.HouseOA;
import com.rjxy.bean.PageBean;
import com.rjxy.bean.Picture;
import com.rjxy.bean.Street;
import com.rjxy.bean.Type;
import com.rjxy.bean.User;
import com.rjxy.service.DistrictService;
import com.rjxy.service.HouseService;
import com.rjxy.service.PicturesService;
import com.rjxy.service.StreetService;
import com.rjxy.service.TypeService;

public class HouseAction extends ActionSupport {
	private int currentPage = 0;
	private PageBean<House> page = new PageBean<House>();
	private int districtId;
	private HouseOA houseOA;
	private File upload;
	private String uploadFileName;
	private String uploadContentType;
	private House house;
	private Picture picture;
	private String district;
	private String street;
	private String type;
	private String bugdate;
	private String hid;
	private String upload1;

	// 显示首页
	public String index() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);

		// 准备下拉框信息 房屋位置
		DistrictService districtService = (DistrictService) ac.getBean("districtService");
		List<District> DistrictList = districtService.findDistrictList();
		ActionContext.getContext().put("districtList", DistrictList);

		// 准备下拉框信息 房型
		TypeService typeService = (TypeService) ac.getBean("typeService");
		List<Type> typeList = typeService.findTypeList();
		ActionContext.getContext().put("typeList", typeList);
		// 准备租房信息
		// 3.从容器中获得houseService
		HouseService houseService = (HouseService) ac.getBean("houseService");
		// 接收当前页
		if (currentPage == 0) {
			page.setCurrentPage(1);
		} else {
			page.setCurrentPage(currentPage);
		}
		page.setCurrentCount(3);
		PageBean<House> houseListPage;
		if (houseOA != null) {
			if (houseOA.getMaxPrice().equals("1000")) {
				houseOA.setMixPrice("0");
			} else if (houseOA.getMaxPrice().equals("2000")) {
				houseOA.setMixPrice("1000");
			} else if (houseOA.getMaxPrice().equals("3000")) {
				houseOA.setMixPrice("2000");
			} else {
				houseOA.setMaxPrice("300000000");
				houseOA.setMixPrice("0");
			}
			if (houseOA.getMaxFloorage().equals("100")) {
				houseOA.setMixFloorage("0");
			} else if (houseOA.getMaxFloorage().equals("200")) {
				houseOA.setMixFloorage("100");
			} else if (houseOA.getMaxFloorage().equals("300")) {
				houseOA.setMixFloorage("200");
			} else {
				houseOA.setMaxFloorage("30000000");
				houseOA.setMixFloorage("0");
			}
			if (houseOA.getStreetId() == null || houseOA.getStreetId().equals("")) {
				houseOA.setStreetId("%%");
			}
			if (houseOA.getTypeId() == null || houseOA.getTypeId().equals("")) {
				houseOA.setTypeId("%%");
			}
			if (houseOA.getTitle() == null || houseOA.getTitle().equals("")) {
				houseOA.setTitle("%%");
			}
			houseListPage = houseService.findHouseListPage(page, houseOA);
			ActionContext.getContext().put("houseOA", houseOA);

			StreetService streetService = (StreetService) ac.getBean("streetService");
			List<Street> streetList = null;
			if (!district.equals("")) {
				streetList = streetService.findStreetListByDId(Integer.parseInt(district));
			}
			ActionContext.getContext().put("streetList", streetList);
			ActionContext.getContext().put("district", district);
		} else {
			houseListPage = houseService.findHouseListPage(page);
		}
		// 分几行一页
		ActionContext.getContext().put("housePage", houseListPage);

		return "index";
	}

	public String addHouse() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		// 3.从容器中获得CustomerService
		HouseService houseService = (HouseService) ac.getBean("houseService");
		try {
			// 当前登录用户
			User user = (User) ActionContext.getContext().getSession().get("Users");
			house.setUser(user);
			// 准备时间
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date parse = null;
			try {
				parse = format.parse(bugdate.toString());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			house.setBugdate(parse);
			// 准备 户型
			TypeService typeService = (TypeService) ac.getBean("typeService");
			Type type2 = typeService.getTypeById(Integer.parseInt(type));
			house.setType(type2);
			// 准备位置 城区
			DistrictService districtService = (DistrictService) ac.getBean("districtService");
			District district2 = districtService.getDistristById(Integer.parseInt(district));
			// 准备位置 街道
			StreetService streetService = (StreetService) ac.getBean("streetService");
			Street street2 = streetService.getStreetById(Integer.parseInt(street));
			street2.setDistrict(district2);
			house.setStreet(street2);
			// 准备图片
			java.io.InputStream is = new java.io.FileInputStream(upload);
			java.io.OutputStream os = new java.io.FileOutputStream("d:\\upload\\" + uploadFileName);
			java.io.OutputStream os2 = new java.io.FileOutputStream(
					ServletActionContext.getServletContext().getRealPath("image") + uploadFileName);
			IOUtils.copy(is, os);
			IOUtils.copy(is, os2);
			is.close();
			os.close();
			picture.setUrl("d:\\upload\\" + uploadFileName);
			picture.setHouse(house);
			house.getPictures().add(picture);
			house.setImage(uploadFileName);
			houseService.saveHouse(house);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "index";
	}

	public String woqunimade() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		// 准备下拉框信息 房屋位置
		HouseService houseService = (HouseService) ac.getBean("houseService");
		House house = houseService.getHouseById(hid);
		PicturesService picturesService = (PicturesService) ac.getBean("picturesService");
		List<Picture> findPictureByHId = picturesService.findPictureByHId(hid);

		ServletActionContext.getRequest().setAttribute("pictures", findPictureByHId);
		ServletActionContext.getRequest().setAttribute("houses", house);

		return "update";
	}

	public String updateHouse() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		// 3.从容器中获得CustomerService
		HouseService houseService = (HouseService) ac.getBean("houseService");

		// 准备时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = null;
		try {
			parse = format.parse(bugdate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		house.setBugdate(parse);
		// 准备 户型
		TypeService typeService = (TypeService) ac.getBean("typeService");
		Type type2 = typeService.getTypeById(Integer.parseInt(type));
		house.setType(type2);
		// 准备位置 城区
		DistrictService districtService = (DistrictService) ac.getBean("districtService");
		District district2 = districtService.getDistristById(Integer.parseInt(district));
		// 准备位置 街道
		StreetService streetService = (StreetService) ac.getBean("streetService");
		Street street2 = streetService.getStreetById(Integer.parseInt(street));
		street2.setDistrict(district2);
		house.setStreet(street2);
		// 准备图片
		java.io.InputStream is;
		try {
			if (upload != null) {
				is = new java.io.FileInputStream(upload);
				java.io.OutputStream os = new java.io.FileOutputStream("d:\\upload\\" + uploadFileName);
				java.io.OutputStream os2 = new java.io.FileOutputStream(
						ServletActionContext.getServletContext().getRealPath("image") + uploadFileName);
				IOUtils.copy(is, os);
				IOUtils.copy(is, os2);
				is.close();
				os.close();
				picture.setUrl("d:\\upload\\" + uploadFileName);
				picture.setHouse(house);
				house.getPictures().add(picture);
				house.setImage(uploadFileName);
			}else{
				picture.setUrl("d:\\upload\\" + uploadFileName);
				picture.setHouse(house);
				house.getPictures().add(picture);
				house.setImage(uploadFileName);
			}
			houseService.updateHouse(house);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";

	}

	/**
	 * 根据房屋位置的Did确定房屋街道
	 *
	 */
	public void getStreetListByDid() {
		ServletContext sc = ServletActionContext.getServletContext();
		// 2.从Sc中获得ac容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StreetService streetService = (StreetService) ac.getBean("streetService");
		String html = "<option value=''>街道不限</option>";
		if (districtId != 0) {
			List<Street> streetListByDId = (List<Street>) streetService.findStreetListByDId(districtId);
			if (streetListByDId != null) {
				for (Street st : streetListByDId) {
					html += "<option  value='" + st.getId() + "'>" + st.getName() + "</option>";
				}
			}
		}
		ServletActionContext.getResponse().setHeader("Content-type", "text/html;charset=UTF-8");
		ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().write(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HouseOA getHouseOA() {
		return houseOA;
	}

	public void setHouseOA(HouseOA houseOA) {
		this.houseOA = houseOA;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public PageBean<House> getPage() {
		return page;
	}

	public void setPage(PageBean<House> page) {
		this.page = page;
	}

	public File getUpload() {
		return upload;
	}

	public String getBugdate() {
		return bugdate;
	}

	public void setBugdate(String bugdate) {
		this.bugdate = bugdate;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public String getUpload1() {
		return upload1;
	}

	public void setUpload1(String upload1) {
		this.upload1 = upload1;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

}
