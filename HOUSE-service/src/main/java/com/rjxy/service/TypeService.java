package com.rjxy.service;

import java.util.List;

import com.rjxy.bean.Type;

public interface TypeService {
	public List<Type> findTypeList() ;
	public Type  getTypeById(Integer id);
}
