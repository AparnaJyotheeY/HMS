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
	public Doctor editNurseDetails(Doctor doctor){
		return doctorDAOImpl.editNurseDetails(doctor);
	}
	public String deleteNurseDetails(String email){
		return doctorDAOImpl.deleteNurseDetails(email);
	}
	public Doctor savePhramacisDetails(Doctor doctor){
		Doctor doc=null;
		doc=doctorDAOImpl.savePhramacisCredentials(doctor);
		return doctorDAOImpl.savePhramacisDetails(doctor);
	}

	public List<Doctor> loadPhramacisDetails(){
		return doctorDAOImpl.loadPhramacisDetails();
	}
	public Doctor editPhramacisDetails(Doctor doctor){
		return doctorDAOImpl.editPhramacisDetails(doctor);
	}
	public String deletePhramacisDetails(String email){
		return doctorDAOImpl.deletePhramacisDetails(email);
	}
	
	public Doctor saveAccountantDetails(Doctor doctor){
		Doctor doc=null;
		doc=doctorDAOImpl.saveAccountantCredentials(doctor);
		return doctorDAOImpl.saveAccountantDetails(doctor);
	}

	public List<Doctor> loadAccountantDetails(){
		return doctorDAOImpl.loadAccountantDetails();
	}
	public Doctor editAccountantDetails(Doctor doctor){
		return doctorDAOImpl.editAccountantDetails(doctor);
	}
	public String deleteAccountantDetails(String email){
		return doctorDAOImpl.deleteAccountantDetails(email);
	}

}
