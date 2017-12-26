package com.rjxy.service;

import java.util.List;

import com.rjxy.bean.Picture;

public interface PicturesService {
	List<Picture> findPictureByHId(String hid);
}
