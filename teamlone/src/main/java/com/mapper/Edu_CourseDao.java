package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Edu_Course;

/**
 * @author lenovo
 *�γ�
 */
public interface Edu_CourseDao {
	
	/**
	 *����Map�����е����ݲ�ѯ�γ�
	 */
	List<Edu_Course>getAllEnd_Course(Map map);
	

	Edu_Course getCourseByID(int id);
	
	List<Edu_Course> getTeaByID(int id);
}
