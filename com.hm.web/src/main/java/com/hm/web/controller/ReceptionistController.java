package com.hm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hm.web.model.ReceptionistBean;
import com.hm.web.service.ReceptionistServiceImpl;

@Controller
public class ReceptionistController {
	
	
	@Autowired
	private ReceptionistServiceImpl receptionistServiceImpl;

	@RequestMapping("/receptionist")
	public String showReceptionist(HttpServletRequest req){
		

				return "hreceptionist";
	}
	@RequestMapping("rambulance")
	public String showRAmbulance(HttpServletRequest req){
		

				return "ramubulance";
	}
	
	
	@RequestMapping(value="/rambulancedetails")
	public String addRAmbulance(HttpServletRequest req){
		
		ReceptionistBean rbean=buildRAmbulance(req);
		
		if(req.getParameter("time").equals("out")){
		
		rbean=receptionistServiceImpl.saveRAmbulanceDetails(rbean);
		req.setAttribute("successmessage", "Ambulance outtime details added successfully");
		return "ramubulance";
		
		}
		else if(req.getParameter("time").equals("in")){
			String anumber=receptionistServiceImpl.saveRAmbulanceOutDetails(req.getParameter("anumber"));
			req.setAttribute("successmessage", "Ambulance intime details added successfully");
			return "ramubulance";
		}
		return "ramubulance";
	}
	private ReceptionistBean buildRAmbulance(HttpServletRequest req){
		ReceptionistBean rbean=new ReceptionistBean();
		rbean.setAmbulancenumber(req.getParameter("anumber"));
		rbean.setDriver(req.getParameter("driver"));
		rbean.setIntime(req.getParameter("time"));
		
		return rbean;
	}
	
}
