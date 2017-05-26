package com.hm.web.service;

import java.util.List;

import com.hm.web.model.DoctorBean;

public interface AdminService {

	
	public DoctorBean saveDoctorDetails(DoctorBean dbean);
	public List<DoctorBean> loadDoctorDetails();
	public DoctorBean editDoctorDetails(DoctorBean dbean);
	public DoctorBean saveNurseDetails(DoctorBean dbean);
	public List<DoctorBean> loadNurseDetails();
	public DoctorBean savePatientDetails(DoctorBean dbean);
	public List<DoctorBean> loadPatientDetails();
	public DoctorBean editPatientDetails(DoctorBean dbean);
	public String deletePatientRecord(String email);
	public DoctorBean saveLaboratoristDetails(DoctorBean dbean);
	public List<DoctorBean> loadLaboratoristDetails();
	public DoctorBean editLaboratoristDetails(DoctorBean dbean);
	public String deleteLaboratoristRecord(String email);
	

}
