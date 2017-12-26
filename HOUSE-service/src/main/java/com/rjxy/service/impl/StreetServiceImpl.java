package com.rjxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.rjxy.bean.Street;
import com.rjxy.dao.StreetDao;
import com.rjxy.service.StreetService;

@Component("streetService")
public class StreetServiceImpl implements StreetService {
	@Resource(name = "streetDao")
	private StreetDao streetDao;

	@Override
	public List<Street> findStreetListByDId(int did) {
		return streetDao.findStreetListByDId(did);
	}
	public void setStreetDao(StreetDao streetDao) {
		this.streetDao = streetDao;
	}
	@Override
	public Street getStreetById(Integer sid) {
		// TODO Auto-generated method stub
		return streetDao.getStreetById(sid);
	}

}
