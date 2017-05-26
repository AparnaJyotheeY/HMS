package com.hm.web.model;

import java.util.Arrays;
import java.util.Date;

public class DoctorBean {
	
	private int did;
	private String name;
	private String email;
	private String password;
	private String address;
	private String phone;
	private String dept;
	private String profile;
	private byte[] image;
	private Date addeddate;
	private String desig;
	private String images;
	private int age;
	private String gender;
	private Date dob;
	private int pid;
	private String bloodgroup;
	private int lid;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "DoctorBean [did=" + did + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", phone=" + phone + ", dept=" + dept + ", profile=" + profile + ", image="
				+ Arrays.toString(image) + ", addeddate=" + addeddate + ", desig=" + desig + ", images=" + images
				+ ", age=" + age + ", gender=" + gender + ", dob=" + dob + ", pid=" + pid + ", bloodgroup=" + bloodgroup
				+ "]";
	}
	

	
}
