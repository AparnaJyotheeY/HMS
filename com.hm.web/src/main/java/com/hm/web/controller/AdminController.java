package com.hm.web.controller;

import java.text.DateFormat;
import java.text.ParseException;
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
import com.hm.web.service.AdminServiceImpl;

@Controller
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;

	@RequestMapping("/admin")
	public String showAdmin(HttpServletRequest req){
		return "admin";
	}
	@RequestMapping("/addoctor")
	public String showAddDoctor(HttpServletRequest req){
		
		List<DoctorBean> dbean=adminServiceImpl.loadDoctorDetails();
		req.setAttribute("doctorlist",dbean);
		
		return "addoctor";
	}
	@RequestMapping(value="/doctordetails",method=RequestMethod.POST)
	public String addDoctor(@RequestParam("image") MultipartFile file,HttpServletRequest req){
		
		DoctorBean dbean=buildDoctor(req);
		try {
			
			if (!file.isEmpty()) {
				byte[] pictureBytes = file.getBytes();					
			
					
					dbean.setImage(pictureBytes);
			}
			
		}catch(Exception e){
			req.setAttribute("message", "Improper Data");
			return "addoctor" ;
		}
		
		List<DoctorBean> dlist=adminServiceImpl.loadDoctorDetails();
		req.setAttribute("doctorlist",dlist);
		
		dbean=adminServiceImpl.saveDoctorDetails(dbean);
		req.setAttribute("successmessage", "doctor details added successfully");
		return "addoctor";
	}
	private DoctorBean buildDoctor(HttpServletRequest req){
		DoctorBean dbean=new DoctorBean();
		dbean.setName(req.getParameter("name"));
		dbean.setEmail(req.getParameter("email"));
		dbean.setPassword(req.getParameter("password"));
		dbean.setDept(req.getParameter("dept"));
		dbean.setAddress(req.getParameter("addr"));
		dbean.setPhone(req.getParameter("phone"));
		dbean.setProfile(req.getParameter("profile"));
		return dbean;
	}
	@RequestMapping(value="/edoctordetails",method=RequestMethod.POST)
	public String editDoctor(HttpServletRequest req){
		
		DoctorBean dbean=buildEditDoctor(req);
		
		
		List<DoctorBean> dlist=adminServiceImpl.loadDoctorDetails();
		req.setAttribute("doctorlist",dlist);
		
		dbean=adminServiceImpl.editDoctorDetails(dbean);
		req.setAttribute("successmessage", "doctor details updated successfully");
		return "addoctor";
	}
	private DoctorBean buildEditDoctor(HttpServletRequest req){
		DoctorBean dbean=new DoctorBean();
		dbean.setDid(Integer.valueOf(req.getParameter("did")));
		dbean.setName(req.getParameter("ename"));
		dbean.setEmail(req.getParameter("eemail"));
		
		dbean.setDept(req.getParameter("edept"));
		dbean.setAddress(req.getParameter("eaddress"));
		dbean.setPhone(req.getParameter("ephone"));

		return dbean;
	}
	@RequestMapping("/exportdexcel")
	public ModelAndView getExcel(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadDoctorDetails();
		return new ModelAndView("DoctorExcel", "doctors",dlist);
	}

	@RequestMapping("/exportdpdf")
	public ModelAndView getPdf(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadDoctorDetails();
		return new ModelAndView("DoctorPdf", "dbean",dlist);
	}
	@RequestMapping("/addnurse")
	public String showAddNurse(HttpServletRequest req){
		
		
		
		return "addnurse";
	}
	@RequestMapping(value="/nursedetails",method=RequestMethod.POST)
	public String addNurse(@RequestParam("image") MultipartFile file,HttpServletRequest req){
		
		DoctorBean dbean=buildNurse(req);
		try {
			
			if (!file.isEmpty()) {
				byte[] pictureBytes = file.getBytes();					
			
					
					dbean.setImage(pictureBytes);
			}
			
		}catch(Exception e){
			req.setAttribute("message", "Improper Data");
			return "addnurse" ;
		}
		
		
		
		dbean=adminServiceImpl.saveNurseDetails(dbean);
		req.setAttribute("successmessage", "doctor details added successfully");
		return "addnurse";
	}
	private DoctorBean buildNurse(HttpServletRequest req){
		DoctorBean dbean=new DoctorBean();
		dbean.setName(req.getParameter("name"));
		dbean.setEmail(req.getParameter("email"));
		dbean.setPassword(req.getParameter("password"));
		
		dbean.setAddress(req.getParameter("address"));
		dbean.setPhone(req.getParameter("phone"));
		
		return dbean;
	}
	@RequestMapping("/addpatient")
	public String showPatient(HttpServletRequest req)
	{
		List<DoctorBean> dbean=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dbean);
		return "addpatient";	
	}
	
	@RequestMapping(value="/patientdetails",method=RequestMethod.POST)
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
     return "addpatient" ;
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
	@RequestMapping(value="/epatientdetails",method=RequestMethod.POST)
	public String editPatientDetails(HttpServletRequest req)
	{
		DoctorBean dbean=buildEditpatientDetails(req);
		
		List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dlist);
		
		dbean=adminServiceImpl.editPatientDetails(dbean);
		req.setAttribute("successmessage", "doctor details updated successfully");
		return "addpatient";
	}
	
	public DoctorBean buildEditpatientDetails(HttpServletRequest req)
	{
		DoctorBean dbean=new DoctorBean();
		dbean.setPid(Integer.valueOf(req.getParameter("pid")));
		dbean.setName(req.getParameter("pname"));
		dbean.setEmail(req.getParameter("pemail"));
		dbean.setAge(Integer.parseInt(req.getParameter("page")));
		dbean.setBloodgroup(req.getParameter("bloodgroup"));
		dbean.setAddress(req.getParameter("paddress"));
		dbean.setPhone(req.getParameter("pphone"));
		return dbean;
	}
	
	@RequestMapping("/exportpexcel")
	public ModelAndView getPatientExcel(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("PatientExcel", "patient",dlist);
	}

	@RequestMapping("/exportppdf")
	public ModelAndView getpatientpdf(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("PatientPdf", "patient",dlist);
	}
	
	@RequestMapping("/deletepatient")
	public String deletePatientRecord(HttpServletRequest req)
	{
		String email=req.getParameter("demail");
		List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dlist);
		adminServiceImpl.deletePatientRecord(email);
		
		return "addpatient";
		
	}
	
	@RequestMapping("/addlaboratorist")
	public String showLaboratorist(HttpServletRequest req)
	{
		List<DoctorBean> dbean=adminServiceImpl.loadLaboratoristDetails();;
		req.setAttribute("laboratoristlist",dbean);
		return "addlaboratorist";	
	}
	
	@RequestMapping(value="/laboratoristdetails",method=RequestMethod.POST)
	public String addLaboratorist(@RequestParam("image") MultipartFile file,HttpServletRequest req) throws Exception
	{
		DoctorBean dbean=buildLaboratorist(req);
     try {
			
			if (!file.isEmpty()) {
				byte[] pictureBytes = file.getBytes();					
			
					
					dbean.setImage(pictureBytes);
			}
			
		}catch(Exception e){
			req.setAttribute("message", "Improper Data");
			return "addlaboratorist" ;
		}
	 
     List<DoctorBean> dlist=adminServiceImpl.loadLaboratoristDetails();
     req.setAttribute("laboratoristlist",dlist);
		
     dbean=adminServiceImpl.saveLaboratoristDetails(dbean);
     req.setAttribute("successmessage", "laboratorist details added successfully");
     return "addlaboratorist" ;
	}
	public DoctorBean buildLaboratorist(HttpServletRequest req) throws Exception
	{
		DoctorBean dbean =new DoctorBean();
		dbean.setName(req.getParameter("name"));
		dbean.setEmail(req.getParameter("email"));
		dbean.setPassword(req.getParameter("password"));
		dbean.setAddress(req.getParameter("address"));
		dbean.setPhone(req.getParameter("phoneno"));
		dbean.setAddeddate(new Date());
		return dbean;
		
	}
	
	@RequestMapping(value="/elaboratoristdetails",method=RequestMethod.POST)
	public String editLaboratoristDetails(HttpServletRequest req)
	{
		DoctorBean dbean=buildEditLaboratoristDetails(req);
		
		List<DoctorBean> dlist=adminServiceImpl.loadLaboratoristDetails();
		req.setAttribute("patientlist",dlist);
		
		dbean=adminServiceImpl.editLaboratoristDetails(dbean);
		req.setAttribute("successmessage", "doctor details updated successfully");
		return "addpatient";
	}
	
	public DoctorBean buildEditLaboratoristDetails(HttpServletRequest req)
	{
		DoctorBean dbean=new DoctorBean();
		dbean.setPid(Integer.valueOf(req.getParameter("lid")));
		dbean.setName(req.getParameter("lname"));
		dbean.setEmail(req.getParameter("lemail"));
		dbean.setAddress(req.getParameter("laddress"));
		dbean.setPhone(req.getParameter("lphoneno"));
		return dbean;
	}
	
	@RequestMapping("/exportlexcel")
	public ModelAndView getLaboratoristExcel(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadLaboratoristDetails();
		return new ModelAndView("LaboratoristtExcel", "Laboratorist",dlist);
	}

	@RequestMapping("/exportlpdf")
	public ModelAndView getLaboratoristpdf(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadLaboratoristDetails();
		return new ModelAndView("LaboratoristPdf", "Laboratorist",dlist);
	}
	
	@RequestMapping("/deletelaboratorist")
	public String deleteLaboratoristRecord(HttpServletRequest req)
	{
		String email=req.getParameter("lemail");
		List<DoctorBean> dlist=adminServiceImpl.loadLaboratoristDetails();
		req.setAttribute("laboratoristlist",dlist);
		adminServiceImpl.deleteLaboratoristRecord(email);
		
		return "addlaboratorist";
		
	}
	
	
}
