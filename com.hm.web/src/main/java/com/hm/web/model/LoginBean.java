package com.hm.web.model;

import java.util.Date;

public class LoginBean {

	private String email;
	private String password;
	private Date createdDate;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "LoginBean [email=" + email + ", password=" + password + ", createdDate=" + createdDate + "]";
	}
	
	
	
	
}
