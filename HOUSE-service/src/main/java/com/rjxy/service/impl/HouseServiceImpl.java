
package com.rjxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.rjxy.bean.House;
import com.rjxy.bean.HouseOA;
import com.rjxy.bean.PageBean;
import com.rjxy.dao.HouseDao;
import com.rjxy.service.HouseService;

@Component("houseService")
public class HouseServiceImpl implements HouseService {
	@Resource(name = "houseDao")
	private HouseDao houseDao;

	@Override
	public PageBean<House> findHouseListPage(PageBean<House> page) {
		int totalCount = houseDao.getHoseTotalCount();
		page.setTotalCount(totalCount);
		if (totalCount % page.getCurrentCount() == 0)
			page.setTotalPage(totalCount / page.getCurrentCount());
		else
			page.setTotalPage(totalCount / page.getCurrentCount() + 1);
		page.setList(houseDao.findHouseListPage(page));
		return page;
	}

	@Override
	public List<House> findHouseList() {

		return houseDao.findHouseList();
	}

	@Override
	public PageBean<House> findHouseListPage(PageBean<House> page, HouseOA houseOA) {
		int totalCount = houseDao.getHoseTotalCount(houseOA);
		page.setTotalCount(totalCount);
		if (totalCount % page.getCurrentCount() == 0)
			page.setTotalPage(totalCount / page.getCurrentCount());
		else
			page.setTotalPage(totalCount / page.getCurrentCount() + 1);
		page.setList(houseDao.findHouseListPage(page, houseOA));
		return page;

	}

	@Override
	public void saveHouse(House house) {
		houseDao.saveHouse(house);
	}

	@Override
	public void updateHouse(House house) {
		houseDao.updateHouse(house);

	}

	@Override
	public House getHouseById(String hid) {

		return houseDao.getHouseById(hid);
	}

	public void setHouseDao(HouseDao houseDao) {
		this.houseDao = houseDao;
	}
}
