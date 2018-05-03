package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Edu_Course;

/**
 * @author lenovo
 *课程
 */
public interface Edu_CourseDao {
	
	/**
	 *按照Map集合中的内容查询课程
	 */
	List<Edu_Course>getAllEnd_Course(Map map);
	

	Edu_Course getCourseByID(int id);
	
	List<Edu_Course> getTeaByID(int id);
}
