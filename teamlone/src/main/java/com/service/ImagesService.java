package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Images;
import com.bean.Teacher;
import com.github.pagehelper.PageInfo;

public interface ImagesService {
	 public PageInfo<Images> getlistAll(Map map,int page);
	  public  Images getById(int id);
	  public void delTe(int id);
	  public void inTer(Images images);
	  public void upTer(Images images);
}
