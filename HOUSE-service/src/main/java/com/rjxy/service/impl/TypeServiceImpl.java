package com.rjxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.rjxy.bean.Type;
import com.rjxy.dao.TypeDao;

@Component("typeService")
public class TypeServiceImpl implements com.rjxy.service.TypeService {
	@Resource(name = "typeDao")
	private TypeDao typeDao;

	@Override
	public List<Type> findTypeList() {
		// TODO Auto-generated method stub
		return typeDao.findTypeList();
	}

	@Override
	public Type getTypeById(Integer id) {

		return typeDao.getTypeById(id);
	}

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

}
