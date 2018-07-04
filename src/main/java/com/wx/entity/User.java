package com.wx.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -2381986381177321326L;

	private Integer id;
	
	private String employId;
	
	private String userName;
	
	private String departmentId;
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployId() {
		return employId;
	}

	public void setEmployId(String employId) {
		this.employId = employId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setPartment(String departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", employId=" + employId + ", userName=" + userName + ", departmentId=" + departmentId
				+ ", password=" + password + "]";
	}

	
	
}
