package com.rjxy.service;

import java.util.List;

import com.rjxy.bean.House;
import com.rjxy.bean.HouseOA;
import com.rjxy.bean.PageBean;

public interface HouseService {

	public PageBean<House> findHouseListPage(PageBean<House> page);

	public PageBean<House> findHouseListPage(PageBean<House> page, HouseOA houseOA);



	public List<House> findHouseList();

	public void saveHouse(House house);

	public void updateHouse(House house);

	public House getHouseById(String hid);

}
