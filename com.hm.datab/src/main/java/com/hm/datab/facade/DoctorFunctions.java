package com.hm.datab.facade;

import java.util.List;

import com.hm.datab.beans.Doctor;

public interface DoctorFunctions {

	public Doctor saveDoctorDetails(Doctor doctor);
	public List<Doctor> loadDoctorDetails();
	public Doctor editDoctorDetails(Doctor doctor);
	public Doctor saveNurseDetails(Doctor doctor);
<<<<<<< HEAD
	
=======
	public List<Doctor> loadNurseDetails();
>>>>>>> branch 'master' of https://github.com/AparnaJyotheeY/HMS
}
