package com.hm.web.service;

import java.util.List;

import com.hm.web.model.DoctorBean;

public interface AdminService {

	
	public DoctorBean saveDoctorDetails(DoctorBean dbean);
	public List<DoctorBean> loadDoctorDetails();

	public DoctorBean editDoctorDetails(DoctorBean dbean);
}
