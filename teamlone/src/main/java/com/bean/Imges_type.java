package com.bean;

public class Imges_type {
	private int type_id;
	private  int type_name;
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getType_name() {
		return type_name;
	}
	public void setType_name(int type_name) {
		this.type_name = type_name;
	}
	@Override
	public String toString() {
		return "Imges_type [type_id=" + type_id + ", type_name=" + type_name + "]";
	}

}