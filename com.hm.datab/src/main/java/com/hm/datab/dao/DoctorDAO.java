package com.hm.datab.dao;

import java.util.List;

import com.hm.datab.beans.Doctor;

public interface DoctorDAO {

	public Doctor saveDoctorDetails(Doctor doctor);
	public Doctor saveDoctorCredentials(Doctor doctor);
	public List<Doctor> loadDoctorDetails();
	public Doctor editDoctorDetails(Doctor doctor);
}
