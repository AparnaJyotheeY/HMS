package com.hm.datab.facade;

import java.util.List;

import com.hm.datab.beans.Doctor;

public interface DoctorFunctions {

	public Doctor saveDoctorDetails(Doctor doctor);
	public List<Doctor> loadDoctorDetails();
	public Doctor editDoctorDetails(Doctor doctor);
	public Doctor saveNurseDetails(Doctor doctor);

	

	public List<Doctor> loadNurseDetails();
	public Doctor editNurseDetails(Doctor doctor);
	public String deleteNurseDetails(String email);
public Doctor savePhramacisDetails(Doctor doctor);

	

	public List<Doctor> loadPhramacisDetails();
	public Doctor editPhramacisDetails(Doctor doctor);
	public String deletePhramacisDetails(String email);
	
public Doctor saveAccountantDetails(Doctor doctor);

	

	public List<Doctor> loadAccountantDetails();
	public Doctor editAccountantDetails(Doctor doctor);
	public String deleteAccountantDetails(String email);
}
