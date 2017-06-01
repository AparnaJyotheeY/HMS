package com.hm.datab.dao;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.hm.datab.beans.Receptionist;

public interface ReceptionistDAO {

	public Receptionist saveRAmbulanceDetails(Receptionist recep) throws UnsupportedEncodingException;
	public String saveRAmbulanceOutDetails(String anumber) throws UnsupportedEncodingException;
	public List<Receptionist> loadRAmbulanceDetails();
	public Receptionist saveRPatientAppointmentDetails(Receptionist recep);
	
}
