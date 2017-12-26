package com.rjxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.rjxy.bean.District;
import com.rjxy.dao.DistrictDao;
import com.rjxy.service.DistrictService;

@Component("districtService")
public class DistrictServiceImpl implements DistrictService {
	@Resource(name = "districtDao")
	private DistrictDao districtDao;

	public void setDistrictDao(DistrictDao districtDao) {
		this.districtDao = districtDao;
	}

	@Override
	public List<District> getDistrictAll() {
		return districtDao.findDistrictList();
	}

	@Override
	public List<District> findDistrictList() {
		// TODO Auto-generated method stub
		return districtDao.findDistrictList();
	}

	@Override
	public District getDistristById(Integer id) {
		// TODO Auto-generated method stub
		return districtDao.getDistristById(id);
	}
}
