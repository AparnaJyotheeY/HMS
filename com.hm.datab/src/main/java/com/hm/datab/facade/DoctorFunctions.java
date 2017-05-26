package com.hm.datab.facade;

import java.util.List;

import com.hm.datab.beans.Doctor;

public interface DoctorFunctions {

	public Doctor saveDoctorDetails(Doctor doctor);
	public List<Doctor> loadDoctorDetails();
	public Doctor editDoctorDetails(Doctor doctor);
	public Doctor saveNurseDetails(Doctor doctor);
	public List<Doctor> loadNurseDetails();
	public Doctor savePatientDetails(Doctor doctor);
	public List<Doctor> loadPatientDetails();
	public Doctor editPatientDetails(Doctor doctor);
	public String deletepatientDetails(String email);
	public Doctor saveLaboratoristDetails(Doctor doctor);
	public List<Doctor> loadLaboratoristDetails();
	public Doctor editLaboratoristDetails(Doctor doctor);
	public String deleteLaboratoristDetails(String email);
	

}
