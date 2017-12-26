package com.rjxy.dao;

import java.util.List;

import com.rjxy.bean.House;
import com.rjxy.bean.HouseOA;
import com.rjxy.bean.PageBean;

public interface HouseDao {
	public List<House> findHouseListPage(PageBean<House> page);

	public int getHoseTotalCount();

	public List<House> findHouseList();

	public List<House> findHouseListPage(final PageBean<House> page, HouseOA houseOA);

	public int getHoseTotalCount(HouseOA houseOA);

	public void saveHouse(House house);

	public void updateHouse(House house);
	
	public House  getHouseById(String hid);
}
