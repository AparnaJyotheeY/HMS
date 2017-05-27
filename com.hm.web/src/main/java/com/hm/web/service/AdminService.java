package com.hm.web.service;

import java.util.List;

import com.hm.web.model.DoctorBean;

public interface AdminService {

	
	public DoctorBean saveDoctorDetails(DoctorBean dbean);
	public List<DoctorBean> loadDoctorDetails();

	public DoctorBean editDoctorDetails(DoctorBean dbean);
	public DoctorBean saveNurseDetails(DoctorBean dbean);

	
	public List<DoctorBean> loadNurseDetails();
	public DoctorBean editNurseDetails(DoctorBean dbean);
	public String deleteNurseDetails(String email);
	public DoctorBean savePhramacistDetails(DoctorBean dbean);

	public List<DoctorBean> loadPhramacistDetails();
	public DoctorBean editPhramacistDetails(DoctorBean dbean);
	public String deletePhramacistDetails(String email);
}
