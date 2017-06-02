package com.hm.web.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

public List<ReceptionistBean> loadRAmbulanceDetails(){
		
		List<Receptionist> ralist=receptionistFunctionsFacade.loadRAmbulanceDetails();
		List<ReceptionistBean> rbean=new ArrayList<ReceptionistBean>();
		for(Receptionist list:ralist){
			ReceptionistBean bean=new ReceptionistBean();
			bean.setAmbulanceid(list.getAmbulanceid());
			bean.setAmbulancenumber(list.getAmbulancenumber());
			bean.setDriver(list.getDriver());
			bean.setIntime(list.getIntime());
			bean.setOuttime(list.getOuttime());
			bean.setStatus(list.getStatus());
			rbean.add(bean);
		}
		return rbean;
	}

@Override
public ReceptionistBean saveRPatientAppintmentDetails(ReceptionistBean  bean)
{
	
	 Receptionist rbean=receptionistBuilder.buildRPatientAppintmentbeanDetails(bean);
	 rbean=receptionistFunctionsFacade.saveRPatientAppointmentDetails(rbean);
	 bean=receptionistBuilder.buildRPatientAppintmentDetails(rbean);
	
    return bean;
}

public ReceptionistBean saveRAmbulanceFuelExpenses(ReceptionistBean dbean)
{
	Receptionist rbean=receptionistBuilder.buildRbeanAmbulanceFuelExp(dbean);
      rbean=receptionistFunctionsFacade.saveRAmbulanceFuelExpensesDetails(rbean);
     dbean=receptionistBuilder.buildReceptionistBean(rbean);
     return dbean;
}
public List<ReceptionistBean> loadRAmbulanceFuelDetails()
{
	 
	List<Receptionist> ralist=receptionistFunctionsFacade.loadRAmbulanceFuelDetails();
	List<ReceptionistBean> rbean=new ArrayList<ReceptionistBean>();
	for(Receptionist list:ralist){
		ReceptionistBean bean=new ReceptionistBean();
		bean.setAmbulanceid(list.getAmbulanceid());
		bean.setAmbulancenumber(list.getAmbulancenumber());
		bean.setDriver(list.getDriver());
		bean.setAddedDate(list.getAddedDate());
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String d=format.format(bean.getAddedDate());
		bean.setFueldate(d);
		bean.setFuelquantity(list.getFuelquantity());
		bean.setFuelamount(list.getFuelamount());
		rbean.add(bean);
	}
	return rbean;
	

}

public 	ReceptionistBean editRAmbulanceFuelDetails(ReceptionistBean dbean)
{
	Receptionist rbean=receptionistBuilder.buildRbeanAmbulanceFuelExp(dbean);
    rbean=receptionistFunctionsFacade.updateRAmbulanceFuelRecordDetails(rbean);
	dbean=receptionistBuilder.buildReceptionistBean(rbean);
 return dbean;
}

public String deleteRAmbulanceFuelRecordDetails(String ambno)
{
	Receptionist rbean=null;
  
	 receptionistFunctionsFacade.deleteRAmbulanceFuelRecord(ambno);
 
	 return ambno;
}

}
