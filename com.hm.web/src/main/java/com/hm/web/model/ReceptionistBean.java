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
	private int pid;
	private String appTime;
	private String caseHistory;
	private String medication;
	private String note;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAppTime() {
		return appTime;
	}
	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}
	public String getCaseHistory() {
		return caseHistory;
	}
	public void setCaseHistory(String caseHistory) {
		this.caseHistory = caseHistory;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
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
				+ addedDate + ", pid=" + pid + ", appTime=" + appTime + ", caseHistory=" + caseHistory + ", medication="
				+ medication + ", note=" + note + "]";
	}
	
	

}
