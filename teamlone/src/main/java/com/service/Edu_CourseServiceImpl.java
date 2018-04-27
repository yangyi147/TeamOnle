package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bean.Edu_Course;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.Edu_CourseDao;
@Service
public class Edu_CourseServiceImpl implements Edu_CourseService {

	@Autowired
	Edu_CourseDao courseDao;
//	@Value("${zh.pagesize}")
	private int pagesize=7;
	@Override
	
	/**
	 * @param map
	 * @param page
	 * @return
	 * 按条件分页分页
	 */public PageInfo<Edu_Course> getAllEnd_Course(Map map,int page) {
		PageHelper.startPage(page,pagesize);
		List<Edu_Course> allEnd_Course = courseDao.getAllEnd_Course(map);
		PageInfo<Edu_Course> p=new PageInfo<Edu_Course>(allEnd_Course);
		return p;
	}
	@Override
	/**
	 *按照id查询课程
	 */
	public Edu_Course getCourseByID(int id) {
		// TODO Auto-generated method stub
		return courseDao.getCourseByID(id);
	}

}
