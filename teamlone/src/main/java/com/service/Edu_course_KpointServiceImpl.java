package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Edu_course_Kpoint;
import com.mapper.Edu_course_KpointDao;
@Service
public class Edu_course_KpointServiceImpl implements Edu_course_KpointService {

	@Autowired
	Edu_course_KpointDao course_KpintService;
	/* (zh)
	 * 按照课程id查询课程节点
	 */
	@Override
	public List<Edu_course_Kpoint> getAllEdu_course_KpointByCourseID(int id) {
		// TODO Auto-generated method stub
		return course_KpintService.getAllEdu_course_KpointByCourseID(id);
	}

}
