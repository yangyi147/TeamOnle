package com.service;

import java.util.List;

import org.apache.shiro.mgt.SubjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Sys_Subject;
import com.mapper.Sys_SubjectDao;
@Service
public class Sys_SubjecterviceImpl implements Sys_Subjectervice {

	@Autowired
	Sys_SubjectDao SubjectDAO;
	@Override
	public List<Sys_Subject> getSubjectById(int id) {
		// TODO Auto-generated method stub
		return SubjectDAO.getSubjectById(id);
	}
	@Override
	public List<Sys_Subject> getAllSubjict() {
		// TODO Auto-generated method stub
		return SubjectDAO.getAllSubjict();
	}
	@Override
	public List<Sys_Subject> getAllSubjictByparent_Id(int id) {
		// TODO Auto-generated method stub
		return SubjectDAO.getAllSubjictByparent_Id(id);
	}
	@Override
	public void insertSubject(Sys_Subject subject) {
		// TODO Auto-generated method stub
		SubjectDAO.insertSubject(subject);
	}

}
