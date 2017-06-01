package com.hm.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hm.web.model.DoctorBean;
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
		
		List<ReceptionistBean> rbean=receptionistServiceImpl.loadRAmbulanceDetails();
		req.setAttribute("rambulancelist",rbean);
				return "ramubulance";
	}
	
	
	@RequestMapping(value="/rambulancedetails")
	public String addRAmbulance(HttpServletRequest req){
		
		ReceptionistBean rbean=buildRAmbulance(req);
		String anumber=rbean.getAmbulancenumber();
		List<ReceptionistBean> abean=receptionistServiceImpl.loadRAmbulanceDetails();
		req.setAttribute("rambulancelist",abean);
		if(req.getParameter("time").equals("out")){
		
		rbean=receptionistServiceImpl.saveRAmbulanceDetails(rbean);
		req.setAttribute("successmessage", "Ambulance outtime details added successfully");
		return "ramubulance";
		
		}
		else if(req.getParameter("time").equals("in")){
			anumber=receptionistServiceImpl.saveRAmbulanceOutDetails(anumber);
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
	
	@RequestMapping("/exportrambexcel")
	public ModelAndView getRAmbulanceExcel(HttpServletRequest req,Model model){
		List<ReceptionistBean> rlist=null;
		rlist=receptionistServiceImpl.loadRAmbulanceDetails();
		return new ModelAndView("RAmbulanceExcel", "rambulance",rlist);
	}

	@RequestMapping("/exportrambpdf")
	public ModelAndView getRAmbulancePdf(HttpServletRequest req,Model model){
		List<ReceptionistBean> rlist=null;
		rlist=receptionistServiceImpl.loadRAmbulanceDetails();
		return new ModelAndView("RAmbulancePdf", "rbean",rlist);
	}
	
	@RequestMapping(value="/erambulancedetails")
	public String editRAmbulance(HttpServletRequest req){
		
		ReceptionistBean rbean=buildeRAmbulance(req);
		String eanumber=rbean.getAmbulancenumber();
		List<ReceptionistBean> abean=receptionistServiceImpl.loadRAmbulanceDetails();
		req.setAttribute("rambulancelist",abean);
		
		
		rbean=receptionistServiceImpl.editRAmbulanceDetails(rbean);
		req.setAttribute("successmessage", "Ambulance details updated successfully");
	
		return "ramubulance";
	}
	private ReceptionistBean buildeRAmbulance(HttpServletRequest req){
		ReceptionistBean rbean=new ReceptionistBean();
		rbean.setAmbulanceid(Integer.valueOf(req.getParameter("eaid")));
		rbean.setAmbulancenumber(req.getParameter("eanumber"));
		rbean.setDriver(req.getParameter("edriver"));
		rbean.setIntime(req.getParameter("etime"));
		
		return rbean;
	}
	@RequestMapping("/deleterambulance")
	public String deleteRAmbulanceRecord(HttpServletRequest req)
	{
		
		List<ReceptionistBean> abean=receptionistServiceImpl.loadRAmbulanceDetails();
		req.setAttribute("rambulancelist",abean);
		int aid=Integer.valueOf(req.getParameter("aid"));
		receptionistServiceImpl.deleteLaboratoristRecord(aid);
	
		
		return "addlaboratorist";
		
	}
	
}
