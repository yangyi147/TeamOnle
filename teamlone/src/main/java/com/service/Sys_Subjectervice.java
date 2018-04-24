package com.service;

import java.util.List;

import com.bean.Sys_Subject;

public interface Sys_Subjectervice {
	
	List<Sys_Subject>getSubjectById(int id);
	
	List<Sys_Subject>getAllSubjict();
	
	List<Sys_Subject>getAllSubjictByparent_Id(int id);
	
	void insertSubject(Sys_Subject subject);

}
