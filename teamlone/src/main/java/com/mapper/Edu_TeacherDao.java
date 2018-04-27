package com.mapper;

import java.util.List;

import com.bean.Edu_Teacher;

/**
 * @author lenovo
 *教师
 */
public interface Edu_TeacherDao {
	
	/**
	 * @return
	 * 查询所有教师
	 */
	List<Edu_Teacher>getAllTeacher();

}
