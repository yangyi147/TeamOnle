package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Images;
import com.bean.Teacher;

public interface ImagesDao {
	  public List<Images> getListAll(Map map);
	  public  Images getById(int id);
	  public void delTe(int id);
	  public void inTer(Images images);
	  public void upTer(Images images);

}
