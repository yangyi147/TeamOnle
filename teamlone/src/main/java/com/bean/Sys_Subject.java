package com.bean;

import java.util.Date;

public class Sys_Subject {
	
	private int SUBJECT_ID;
	
	private String SUBJECT_NAME;
	
	private int STATUS;
	
	private Date CREATE_TIME;
	
	private int PARENT_ID;
	
	private int sort;

	public int getSUBJECT_ID() {
		return SUBJECT_ID;
	}

	public void setSUBJECT_ID(int sUBJECT_ID) {
		SUBJECT_ID = sUBJECT_ID;
	}

	public String getSUBJECT_NAME() {
		return SUBJECT_NAME;
	}

	public void setSUBJECT_NAME(String sUBJECT_NAME) {
		SUBJECT_NAME = sUBJECT_NAME;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public int getPARENT_ID() {
		return PARENT_ID;
	}

	public void setPARENT_ID(int pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Sys_Subject [SUBJECT_ID=" + SUBJECT_ID + ", SUBJECT_NAME=" + SUBJECT_NAME + ", STATUS=" + STATUS
				+ ", CREATE_TIME=" + CREATE_TIME + ", PARENT_ID=" + PARENT_ID + ", sort=" + sort + "]";
	}
	
	

}
