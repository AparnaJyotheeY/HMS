package com.hm.datab.facade;

import java.util.List;

import com.hm.datab.beans.Receptionist;

public interface ReceptionistFunctions {

	public Receptionist saveRAmbulanceDetails(Receptionist recep);
	public String saveRAmbulanceOutDetails(String anumber);
	public List<Receptionist> loadRAmbulanceDetails();
	public Receptionist editRAmbulanceDetails(Receptionist recep);
	
	public int deleteRAmbulanceDetails(int aid);
}
