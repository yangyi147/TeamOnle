package com.bean;

import java.util.Date;

public class Function {
	private  int FUNCTION_ID;
	private  int PARENT_ID;
	private String FUNCTION_NAME;
	private String FUNCTION_URL;
	private int  FUNCTION_TYPE;
	private Date  CREATE_TIME;
	private int SORT;
	public int getFUNCTION_ID() {
		return FUNCTION_ID;
	}
	public void setFUNCTION_ID(int fUNCTION_ID) {
		FUNCTION_ID = fUNCTION_ID;
	}
	public int getPARENT_ID() {
		return PARENT_ID;
	}
	public void setPARENT_ID(int pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}
	public String getFUNCTION_NAME() {
		return FUNCTION_NAME;
	}
	public void setFUNCTION_NAME(String fUNCTION_NAME) {
		FUNCTION_NAME = fUNCTION_NAME;
	}
	public String getFUNCTION_URL() {
		return FUNCTION_URL;
	}
	public void setFUNCTION_URL(String fUNCTION_URL) {
		FUNCTION_URL = fUNCTION_URL;
	}
	public int getFUNCTION_TYPE() {
		return FUNCTION_TYPE;
	}
	public void setFUNCTION_TYPE(int fUNCTION_TYPE) {
		FUNCTION_TYPE = fUNCTION_TYPE;
	}
	
	public int getSORT() {
		return SORT;
	}
	public void setSORT(int sORT) {
		SORT = sORT;
	}
	@Override
	public String toString() {
		return "Function [FUNCTION_ID=" + FUNCTION_ID + ", PARENT_ID=" + PARENT_ID + ", FUNCTION_NAME=" + FUNCTION_NAME
				+ ", FUNCTION_URL=" + FUNCTION_URL + ", FUNCTION_TYPE=" + FUNCTION_TYPE + ", CREATE_TIME=" + CREATE_TIME
				+ ", SORT=" + SORT + "]";
	}
}
