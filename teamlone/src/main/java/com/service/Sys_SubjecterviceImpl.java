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
	/* (non-Javadoc)
	 * 查询所有专业按照id
	 */
	@Override
	public List<Sys_Subject> getSubjectById(int id) {
		// TODO Auto-generated method stub
		return SubjectDAO.getSubjectById(id);
	}
	/* (zh)
	 * 查询所有id
	 */
	@Override
	public List<Sys_Subject> getAllSubjict() {
		// TODO Auto-generated method stub
		return SubjectDAO.getAllSubjict();
	}
	/* (zh)
	 *按照专业的父id查询所有子属性
	 */
	@Override
	public List<Sys_Subject> getAllSubjictByparent_Id() {
		// TODO Auto-generated method stub
		return SubjectDAO.getAllSubjictByparent_Id();
	}
	/* (zh)
	 * 添加专业
	 */
	@Override
	public void insertSubject(Sys_Subject subject) {
		// TODO Auto-generated method stub
		SubjectDAO.insertSubject(subject);
	}

}
