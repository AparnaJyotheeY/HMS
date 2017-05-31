package com.hm.datab.facade.impl;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.datab.beans.Receptionist;
import com.hm.datab.dao.ReceptionistDAO;
import com.hm.datab.facade.ReceptionistFunctions;

@Component
public class ReceptionistFunctionsFacade implements ReceptionistFunctions{
	
	@Autowired
	private ReceptionistDAO receptionistDAOImpl;
	
	public Receptionist saveRAmbulanceDetails(Receptionist recep){
		Receptionist rec=null;
	
		try {
			rec= receptionistDAOImpl.saveRAmbulanceDetails(recep);
		} catch (UnsupportedEncodingException e) {
			// TODO AureceptionistDAOImpl.saveRAmbulanceDetails(recep)to-generated catch block
			e.printStackTrace();
		}
		return rec;
	}
	public String saveRAmbulanceOutDetails(String anumber){
	
	
		try {
			anumber= receptionistDAOImpl.saveRAmbulanceOutDetails(anumber);
		} catch (UnsupportedEncodingException e) {
			// TODO AureceptionistDAOImpl.saveRAmbulanceDetails(recep)to-generated catch block
			e.printStackTrace();
		}
		return anumber;
	}

}