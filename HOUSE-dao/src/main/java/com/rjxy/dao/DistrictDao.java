package com.rjxy.dao;

import java.util.List;

import com.rjxy.bean.District;

public interface DistrictDao {
	public List<District> findDistrictList();

	public District getDistristById(Integer id);
}
