package com.hm.datab.beans;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Login {
	private String email;
	private String password;
	private Date createdDate;
	private String desig;
	
	
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
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
		return "Login [email=" + email + ", password=" + password + ", createdDate=" + createdDate + ", desig=" + desig
				+ "]";
	}
	
	
}
