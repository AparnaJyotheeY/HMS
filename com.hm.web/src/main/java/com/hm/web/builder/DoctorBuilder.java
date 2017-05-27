package com.hm.web.builder;

import org.springframework.stereotype.Component;

import com.hm.datab.beans.Doctor;
import com.hm.web.model.DoctorBean;

@Component
public class DoctorBuilder {

	public Doctor buildDocotor(DoctorBean dbean){
		
		Doctor doctor=new Doctor();
		doctor.setNurseid(dbean.getNurseid());
		doctor.setPharmacistid(dbean.getPharmacistid());
		doctor.setName(dbean.getName());
		doctor.setEmail(dbean.getEmail());
		doctor.setPassword(dbean.getPassword());
		doctor.setDept(dbean.getDept());
		doctor.setPhone(dbean.getPhone());
		doctor.setProfile(dbean.getProfile());
		doctor.setImage(dbean.getImage());
		doctor.setAddress(dbean.getAddress());
		doctor.setAddeddate(dbean.getAddeddate());
		return doctor;
		
	}
public DoctorBean buildDocotorBean(Doctor dbean){
		
		DoctorBean doctor=new DoctorBean();
		doctor.setNurseid(dbean.getNurseid());
		doctor.setPharmacistid(dbean.getPharmacistid());
		doctor.setName(dbean.getName());
		doctor.setEmail(dbean.getEmail());
		doctor.setPassword(dbean.getPassword());
		doctor.setDept(dbean.getDept());
		doctor.setPhone(dbean.getPhone());
		doctor.setProfile(dbean.getProfile());
		doctor.setImage(dbean.getImage());
		doctor.setAddress(dbean.getAddress());
		doctor.setAddeddate(dbean.getAddeddate());
		return doctor;
		
	}
}
