package com.rjxy.service;

import java.util.List;

import com.rjxy.bean.Street;

public interface StreetService {
	public List<Street> findStreetListByDId(int did);
	public Street getStreetById(Integer sid);
}
