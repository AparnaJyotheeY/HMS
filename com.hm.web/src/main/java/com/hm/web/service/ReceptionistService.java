package com.hm.web.service;

import java.util.List;

import com.hm.web.model.ReceptionistBean;

public interface ReceptionistService {

	public ReceptionistBean saveRAmbulanceDetails(ReceptionistBean dbean);
	public String saveRAmbulanceOutDetails(String anumber);
	public List<ReceptionistBean> loadRAmbulanceDetails();
	public ReceptionistBean saveRPatientAppintmentDetails(ReceptionistBean  bean);
    public ReceptionistBean saveRAmbulanceFuelExpenses(ReceptionistBean dbean);
    public List<ReceptionistBean> loadRAmbulanceFuelDetails();
    public 	ReceptionistBean editRAmbulanceFuelDetails(ReceptionistBean dbean);
    public String deleteRAmbulanceFuelRecordDetails(String ambno);
}
