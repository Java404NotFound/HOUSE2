package com.rjxy.dao;

import java.util.List;

import com.rjxy.bean.Street;

public interface StreetDao {
  public List<Street> findStreetListByDId(int did);
  public Street   getStreetById(Integer sid);
}
