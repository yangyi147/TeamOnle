package com.bean;

import java.util.Date;

public class Sys_User {
	
	private int USER_ID;

	private String LOGIN_NAME;
	
	private String LOGIN_PWD;
	
	private String USER_NAME;
	
	private  int  STATUS;
	
	private Date LAST_LOGIN_TIME;
	
	private String LAST_LOGIN_IP;
	
	private Date CREATE_TIME;
	
	private String EMAIL;
	
	private String TEL;
	
	private Sys_Role roel;

	public int getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getLOGIN_NAME() {
		return LOGIN_NAME;
	}

	public void setLOGIN_NAME(String lOGIN_NAME) {
		LOGIN_NAME = lOGIN_NAME;
	}

	public String getLOGIN_PWD() {
		return LOGIN_PWD;
	}

	public void setLOGIN_PWD(String lOGIN_PWD) {
		LOGIN_PWD = lOGIN_PWD;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public Date getLAST_LOGIN_TIME() {
		return LAST_LOGIN_TIME;
	}

	public void setLAST_LOGIN_TIME(Date lAST_LOGIN_TIME) {
		LAST_LOGIN_TIME = lAST_LOGIN_TIME;
	}

	public String getLAST_LOGIN_IP() {
		return LAST_LOGIN_IP;
	}

	public void setLAST_LOGIN_IP(String lAST_LOGIN_IP) {
		LAST_LOGIN_IP = lAST_LOGIN_IP;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tEL) {
		TEL = tEL;
	}

	public Sys_Role getRoel() {
		return roel;
	}

	public void setRoel(Sys_Role roel) {
		this.roel = roel;
	}

	@Override
	public String toString() {
		return "Sys_User [USER_ID=" + USER_ID + ", LOGIN_NAME=" + LOGIN_NAME + ", LOGIN_PWD=" + LOGIN_PWD
				+ ", USER_NAME=" + USER_NAME + ", STATUS=" + STATUS + ", LAST_LOGIN_TIME=" + LAST_LOGIN_TIME
				+ ", LAST_LOGIN_IP=" + LAST_LOGIN_IP + ", CREATE_TIME=" + CREATE_TIME + ", EMAIL=" + EMAIL + ", TEL="
				+ TEL + ", roel=" + roel + "]";
	}
	
	
	
	
	
}
