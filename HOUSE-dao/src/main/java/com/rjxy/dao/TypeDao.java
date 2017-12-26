package com.rjxy.dao;

import java.util.List;

import com.rjxy.bean.Type;

public interface TypeDao {
	public List<Type> findTypeList();
 public Type getTypeById(Integer id);
}
