package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Images;
import com.mapper.ImagesDao;

@Service
public class ImagesServiceImpl implements ImagesService {

	@Autowired
	private ImagesDao imagesDao;
	@Override
	public List<Images> getListAll() {
		return imagesDao.getListAll();
	}

}
