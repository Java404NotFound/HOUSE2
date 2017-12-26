package com.rjxy.service;

import java.util.List;

import com.rjxy.bean.District;

public interface DistrictService {
	   List<District> getDistrictAll();
	   public List<District> findDistrictList();
	   public District getDistristById(Integer id);
}
