package com.rjxy.dao;

import java.util.List;
import java.util.Set;

import com.rjxy.bean.Picture;

public interface PictureDao {
  public List<Picture> findPictureByHId(String hid);
}
