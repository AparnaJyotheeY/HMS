package com.hm.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.datab.beans.Receptionist;
import com.hm.datab.facade.impl.ReceptionistFunctionsFacade;
import com.hm.web.builder.ReceptionistBuilder;
import com.hm.web.model.ReceptionistBean;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {
	
	@Autowired
	private ReceptionistBuilder receptionistBuilder;
	
	@Autowired
	private ReceptionistFunctionsFacade receptionistFunctionsFacade;
	
	
	public ReceptionistBean saveRAmbulanceDetails(ReceptionistBean dbean){
		Receptionist recep=receptionistBuilder.buildReceptionist(dbean);
		recep=receptionistFunctionsFacade.saveRAmbulanceDetails(recep);
		dbean=receptionistBuilder.buildReceptionistBean(recep);
		
		return dbean;
	}
	
	public String saveRAmbulanceOutDetails(String anumber){
		
		anumber=receptionistFunctionsFacade.saveRAmbulanceOutDetails(anumber);
		
		
		return anumber;
	}

	

}
