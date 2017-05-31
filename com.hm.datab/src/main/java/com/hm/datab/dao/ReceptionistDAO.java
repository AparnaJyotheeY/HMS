package com.hm.datab.dao;

import java.io.UnsupportedEncodingException;

import com.hm.datab.beans.Doctor;
import com.hm.datab.beans.Receptionist;

public interface ReceptionistDAO {

	public Receptionist saveRAmbulanceDetails(Receptionist recep) throws UnsupportedEncodingException;
	public String saveRAmbulanceOutDetails(String anumber) throws UnsupportedEncodingException;
	
}
