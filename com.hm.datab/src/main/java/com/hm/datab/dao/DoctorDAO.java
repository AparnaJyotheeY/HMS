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
