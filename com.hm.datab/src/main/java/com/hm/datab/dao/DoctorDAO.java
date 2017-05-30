package com.hm.datab.dao;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.hm.datab.beans.Doctor;

public interface DoctorDAO {

	public Doctor saveDoctorDetails(Doctor doctor) throws UnsupportedEncodingException;
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

	public Doctor saveAccountantDetails(Doctor doctor);
	public Doctor saveAccountantCredentials(Doctor doctor);
	public List<Doctor> loadAccountantDetails();
	public Doctor editAccountantDetails(Doctor doctor);
	public String deleteAccountantDetails(String email);

	public Doctor savePatientDetails(Doctor doctor);
	public Doctor savePatientCredentials(Doctor doctor);
	public List<Doctor> loadPatientDetails();
	public Doctor editPatientDetails(Doctor doctor);
	public String deletePatientRecord(String email);
	public Doctor saveLaboratoristDetails(Doctor doctor);
	public Doctor saveLaboratoristCredentials(Doctor doctor);
	public List<Doctor> loadLaboratoristDetails();
	public Doctor editLaboratoristDetails(Doctor doctor);
	public String deleteLaboratoristRecord(String email);

}
