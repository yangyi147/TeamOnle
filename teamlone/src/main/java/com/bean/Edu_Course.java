package com.bean;

import java.util.Date;



public class Edu_Course {
	
	private int course_id;
	
	private String course_name;
	
	private int is_avaliable;
	
	private Sys_Subject subject;
	
	private Date add_time;
	
	private double source_prlce;
	
	private double current_price;
	
	private String title;
	
	private String context;
	
	private int lession_num;
	
	private  String logo;
	
	private Date update_time;
	
	private int page_buycount;
	
	private int page_vlewcount;
	
	private Date end_time;
	
	private int losetype;
	        
	private String lose_time;
	
	private int sequence;
	
	private double course_gross_income;

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getIs_avaliable() {
		return is_avaliable;
	}

	public void setIs_avaliable(int is_avaliable) {
		this.is_avaliable = is_avaliable;
	}


	public Sys_Subject getSubject() {
		return subject;
	}

	public void setSubject(Sys_Subject subject) {
		this.subject = subject;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public double getSource_prlce() {
		return source_prlce;
	}

	public void setSource_prlce(double source_prlce) {
		this.source_prlce = source_prlce;
	}

	public double getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int getLession_num() {
		return lession_num;
	}

	public void setLession_num(int lession_num) {
		this.lession_num = lession_num;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public int getPage_buycount() {
		return page_buycount;
	}

	public void setPage_buycount(int page_buycount) {
		this.page_buycount = page_buycount;
	}

	public int getPage_vlewcount() {
		return page_vlewcount;
	}

	public void setPage_vlewcount(int page_vlewcount) {
		this.page_vlewcount = page_vlewcount;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public int getLosetype() {
		return losetype;
	}

	public void setLosetype(int losetype) {
		this.losetype = losetype;
	}

	public String getLose_time() {
		return lose_time;
	}

	public void setLose_time(String lose_time) {
		this.lose_time = lose_time;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public double getCourse_gross_income() {
		return course_gross_income;
	}

	public void setCourse_gross_income(double course_gross_income) {
		this.course_gross_income = course_gross_income;
	}

	@Override
	public String toString() {
		return "Edu_Course [course_id=" + course_id + ", course_name=" + course_name + ", is_avaliable=" + is_avaliable
				+ ", subject=" + subject + ", add_time=" + add_time + ", source_prlce=" + source_prlce
				+ ", current_price=" + current_price + ", title=" + title + ", context=" + context + ", lession_num="
				+ lession_num + ", logo=" + logo + ", update_time=" + update_time + ", page_buycount=" + page_buycount
				+ ", page_vlewcount=" + page_vlewcount + ", end_time=" + end_time + ", losetype=" + losetype
				+ ", lose_time=" + lose_time + ", sequence=" + sequence + ", course_gross_income=" + course_gross_income
				+ "]";
	}

	
	

}
