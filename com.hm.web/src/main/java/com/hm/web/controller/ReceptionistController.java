package com.hm.web.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hm.web.model.DoctorBean;
import com.hm.web.model.ReceptionistBean;
import com.hm.web.service.AdminServiceImpl;
import com.hm.web.service.ReceptionistServiceImpl;

@Controller
public class ReceptionistController {
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	@Autowired
	private ReceptionistServiceImpl receptionistServiceImpl;
	@RequestMapping("/receptionist")
	public String showDoctor(HttpServletRequest req){
		

				return "hreceptionist";
	}
	@RequestMapping("/addrpatient")
	public String showPatient(HttpServletRequest req)
	{
		List<DoctorBean> dbean=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dbean);
		return "rpatient";	
	}
	
	@RequestMapping(value="/rpatientdetails",method=RequestMethod.POST)
	public String addPatient(@RequestParam("image") MultipartFile file,HttpServletRequest req) throws Exception
	{
		DoctorBean dbean=buildPatient(req);
     try {
			
			if (!file.isEmpty()) {
				byte[] pictureBytes = file.getBytes();					
			
					
					dbean.setImage(pictureBytes);
			}
			
		}catch(Exception e){
			req.setAttribute("message", "Improper Data");
			return "addpatient" ;
		}
     List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
     req.setAttribute("patientlist",dlist);
	
     dbean=adminServiceImpl.savePatientDetails(dbean);
     req.setAttribute("successmessage", "patient details added successfully");
     return "rpatient" ;
	}
	public DoctorBean buildPatient(HttpServletRequest req) throws Exception
	{
		DoctorBean dbean =new DoctorBean();
		dbean.setName(req.getParameter("name"));
		dbean.setEmail(req.getParameter("email"));
		dbean.setPassword(req.getParameter("password"));
		dbean.setAddress(req.getParameter("address"));
		dbean.setPhone(req.getParameter("phoneno"));
		dbean.setGender(req.getParameter("gender"));
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		dbean.setDob(format.parse(req.getParameter("dob")));
		dbean.setAge(Integer.parseInt(req.getParameter("age")));
		dbean.setBloodgroup(req.getParameter("bloodgroup"));
		dbean.setAddeddate(new Date());
		return dbean;
		
	}
	@RequestMapping(value="/erpatientdetails",method=RequestMethod.POST)
	public String editPatientDetails(HttpServletRequest req)
	{
		DoctorBean dbean=buildEditpatientDetails(req);
		
		List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dlist);
		
		dbean=adminServiceImpl.editPatientDetails(dbean);
		req.setAttribute("successmessage", "doctor details updated successfully");
		return "rpatient";
	}
	
	public DoctorBean buildEditpatientDetails(HttpServletRequest req)
	{
		DoctorBean dbean=new DoctorBean();
		dbean.setAddeddate(new Date());
		dbean.setPid(Integer.valueOf(req.getParameter("pid")));
		dbean.setName(req.getParameter("pname"));
		dbean.setEmail(req.getParameter("pemail"));
		dbean.setAge(Integer.parseInt(req.getParameter("page")));
		dbean.setBloodgroup(req.getParameter("bloodgroup"));
		dbean.setAddress(req.getParameter("paddress"));
		dbean.setPhone(req.getParameter("pphone"));
		return dbean;
	}
	
	@RequestMapping("/exportdrpexcel")
	public ModelAndView getPatientExcel(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("PatientExcel", "patient",dlist);
	}

	@RequestMapping("/exportrpdpdf")
	public ModelAndView getpatientpdf(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("PatientPdf", "patient",dlist);
	}
	
	@RequestMapping("/deleterpatient")
	public String deletePatientRecord(HttpServletRequest req)
	{
		String email=req.getParameter("demail");
		List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dlist);
		adminServiceImpl.deletePatientRecord(email);
		
		return "rpatient";
		
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
