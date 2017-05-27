package com.hm.datab.dao;

import java.util.List;

import com.hm.datab.beans.Doctor;

public interface DoctorDAO {

	public Doctor saveDoctorDetails(Doctor doctor);
	public Doctor saveDoctorCredentials(Doctor doctor);
	public List<Doctor> loadDoctorDetails();
	public Doctor editDoctorDetails(Doctor doctor);
	public Doctor saveNurseDetails(Doctor doctor);
	public Doctor saveNurseCredentials(Doctor doctor);


	public List<Doctor> loadNurseDetails();
	public Doctor editNurseDetails(Doctor doctor);
	public String deleteNurseDetails(String email);
	public Doctor savePhramacisDetails(Doctor doctor);
	public Doctor savePhramacisCredentials(Doctor doctor);


	public List<Doctor> loadPhramacisDetails();
	public Doctor editPhramacisDetails(Doctor doctor);
	public String deletePhramacisDetails(String email);
	
	public Doctor saveAccountantCredentials(Doctor doctor);


	public List<Doctor> loadAccountantDetails();
	public Doctor editAccountantDetails(Doctor doctor);
	public String deleteAccountantDetails(String email);
}
