package com.hm.datab.beans;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Doctor {


		private int did;
		private int nurseid;
		private int pharmacistid;
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
		
		
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		
		
		public int getNurseid() {
			return nurseid;
		}
		public void setNurseid(int nurseid) {
			this.nurseid = nurseid;
		}
		
		public int getPharmacistid() {
			return pharmacistid;
		}
		public void setPharmacistid(int pharmacistid) {
			this.pharmacistid = pharmacistid;
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
			return "Doctor [did=" + did + ", nurseid=" + nurseid + ", pharmacistid=" + pharmacistid + ", name=" + name
					+ ", email=" + email + ", password=" + password + ", address=" + address + ", phone=" + phone
					+ ", dept=" + dept + ", profile=" + profile + ", image=" + Arrays.toString(image) + ", addeddate="
					+ addeddate + ", desig=" + desig + "]";
		}
		
		
	}

