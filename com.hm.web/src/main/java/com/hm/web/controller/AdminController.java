package com.hm.web.controller;

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
	
}
