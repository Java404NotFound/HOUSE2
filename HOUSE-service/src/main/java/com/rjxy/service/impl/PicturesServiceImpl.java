package com.rjxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.rjxy.bean.Picture;
import com.rjxy.dao.PictureDao;
import com.rjxy.service.PicturesService;
@Component("picturesService")
public class PicturesServiceImpl implements PicturesService {
	@Resource(name = "pictureDao")
	public PictureDao pictureDao;
	@Override
	public List<Picture> findPictureByHId(String hid) {
		// TODO Auto-generated method stub
		return pictureDao.findPictureByHId(hid);
	}

	public PictureDao getPictureDao() {
		return pictureDao;
	}

	public void setPictureDao(PictureDao pictureDao) {
		this.pictureDao = pictureDao;
	}

}
