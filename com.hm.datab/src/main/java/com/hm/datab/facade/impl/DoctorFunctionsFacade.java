package com.hm.datab.facade.impl;

import java.io.UnsupportedEncodingException;
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
	
	public Doctor saveDoctorDetails(Doctor doctor) throws UnsupportedEncodingException{
		Doctor doc=null;
		doc=doctorDAOImpl.saveDoctorCredentials(doctor);
		doc= doctorDAOImpl.saveDoctorDetails(doctor);
		return doc;
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
