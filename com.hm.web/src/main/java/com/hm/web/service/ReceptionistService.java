package com.hm.web.service;

import java.util.List;

import com.hm.web.model.ReceptionistBean;

public interface ReceptionistService {

	public ReceptionistBean saveRAmbulanceDetails(ReceptionistBean dbean);
	public String saveRAmbulanceOutDetails(String anumber);
	public List<ReceptionistBean> loadRAmbulanceDetails();
	public ReceptionistBean editRAmbulanceDetails(ReceptionistBean dbean);
	
	public int deleteLaboratoristRecord(int aid);
	
}
