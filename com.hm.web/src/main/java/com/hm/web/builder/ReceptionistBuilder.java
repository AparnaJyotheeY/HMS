package com.hm.web.builder;

import org.springframework.stereotype.Component;

import com.hm.datab.beans.Receptionist;
import com.hm.web.model.ReceptionistBean;

@Component
public class ReceptionistBuilder {
	
	public ReceptionistBean buildReceptionistBean(Receptionist recep){
		
		ReceptionistBean rbean= new ReceptionistBean();
		rbean.setAmbulanceid(recep.getAmbulanceid());
		rbean.setAmbulancenumber(recep.getAmbulancenumber());
		rbean.setDriver(recep.getDriver());
		rbean.setIntime(recep.getIntime());
		rbean.setOuttime(recep.getOuttime());
		rbean.setStatus(recep.getStatus());
		
		
		
		return rbean;
		
	}
public Receptionist buildReceptionist(ReceptionistBean recep){
		
		Receptionist  rbean= new Receptionist();
		rbean.setAmbulanceid(recep.getAmbulanceid());
		rbean.setAmbulancenumber(recep.getAmbulancenumber());
		rbean.setDriver(recep.getDriver());
		rbean.setIntime(recep.getIntime());
		rbean.setOuttime(recep.getOuttime());
		rbean.setStatus(recep.getStatus());
		
		
		
		return rbean;
		
	}

}
