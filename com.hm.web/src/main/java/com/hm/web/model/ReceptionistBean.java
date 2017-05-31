package com.hm.web.model;

import java.util.Date;

public class ReceptionistBean {
	
	private int ambulanceid;
	private String ambulancenumber;
	private String driver;
	private String intime;
	private String outtime;
	private String status;
	private Date addedDate;
	public int getAmbulanceid() {
		return ambulanceid;
	}
	public void setAmbulanceid(int ambulanceid) {
		this.ambulanceid = ambulanceid;
	}
	public String getAmbulancenumber() {
		return ambulancenumber;
	}
	public void setAmbulancenumber(String ambulancenumber) {
		this.ambulancenumber = ambulancenumber;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	@Override
	public String toString() {
		return "ReceptionistBean [ambulanceid=" + ambulanceid + ", ambulancenumber=" + ambulancenumber + ", driver="
				+ driver + ", intime=" + intime + ", outtime=" + outtime + ", status=" + status + ", addedDate="
				+ addedDate + "]";
	}
	

}
