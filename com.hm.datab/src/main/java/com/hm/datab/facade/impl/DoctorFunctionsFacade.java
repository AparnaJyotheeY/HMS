package com.hm.datab.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.datab.beans.Doctor;
import com.hm.datab.dao.DoctorDAO;
import com.hm.datab.facade.DoctorFunctions;

@Component
public class DoctorFunctionsFacade implements DoctorFunctions{

	@Autowired
	private DoctorDAO doctorDAOImpl;
	
	public Doctor saveDoctorDetails(Doctor doctor){
		Doctor doc=null;
		doc=doctorDAOImpl.saveDoctorCredentials(doctor);
		return doctorDAOImpl.saveDoctorDetails(doctor);
	}
	public Doctor saveNurseDetails(Doctor doctor){
		Doctor doc=null;
		doc=doctorDAOImpl.saveNurseCredentials(doctor);
		return doctorDAOImpl.saveNurseDetails(doctor);
	}
	
	public List<Doctor> loadDoctorDetails(){
		return doctorDAOImpl.loadDoctorDetails();
	}
	public Doctor editDoctorDetails(Doctor doctor){
		return doctorDAOImpl.editDoctorDetails(doctor);
	}

	public List<Doctor> loadNurseDetails(){
		return doctorDAOImpl.loadNurseDetails();
	}
	
	public Doctor savePatientDetails(Doctor doctor)
	{
		Doctor doc=null;
		doc=doctorDAOImpl.savePatientCredentials(doctor);
		return doctorDAOImpl.savePatientDetails(doctor);
		
	}
	
	public List<Doctor> loadPatientDetails()
	{
		
		return doctorDAOImpl.loadPatientDetails();
	}
	
	public Doctor editPatientDetails(Doctor doctor)
	{
		
		return doctorDAOImpl.editPatientDetails(doctor);
		
	}
	public String deletepatientDetails(String email)
	{
		
		return doctorDAOImpl.deletePatientRecord(email);
		
	}
	
	public Doctor saveLaboratoristDetails(Doctor doctor){
		Doctor doc=null;
		doc=doctorDAOImpl.saveLaboratoristCredentials(doctor);
		return doctorDAOImpl.saveLaboratoristDetails(doctor);
	}
	
	public List<Doctor> loadLaboratoristDetails(){
		return doctorDAOImpl.loadLaboratoristDetails();
	}
	public Doctor editLaboratoristDetails(Doctor doctor)
	{
		
		return doctorDAOImpl.editLaboratoristDetails(doctor);
		
	}
	public String deleteLaboratoristDetails(String email)
	{
		
		return doctorDAOImpl.deleteLaboratoristRecord(email);
		
	}
	

}
