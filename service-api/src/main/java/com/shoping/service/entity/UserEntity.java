package com.shoping.service.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String userName;
	private Integer age;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}