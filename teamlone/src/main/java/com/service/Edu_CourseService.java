package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Edu_Course;
import com.github.pagehelper.PageInfo;

public interface Edu_CourseService {
	
	
	PageInfo<Edu_Course>getAllEnd_Course(Map map,int page);
	
	/**
	 * @param id
	 * @return
	 * 
	 */
	Edu_Course getCourseByID(int id);

}
