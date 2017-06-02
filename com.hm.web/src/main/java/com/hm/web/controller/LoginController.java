package com.hm.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hm.web.exceptions.LoginExceptions;
import com.hm.web.model.DoctorBean;
import com.hm.web.model.LoginBean;
import com.hm.web.service.AdminServiceImpl;
import com.hm.web.service.HotelServiceImpl;
import com.hm.web.util.ApplicationConstants;

@Controller
public class LoginController {

	@Autowired
	private HotelServiceImpl hotelServiceImpl;
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;

	
	@RequestMapping(value="/alogin")
	public ModelAndView showLogin(HttpServletResponse response,HttpServletRequest request) throws IOException{
		
		
		return new ModelAndView("login");
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLogin(@ModelAttribute("user") LoginBean user,HttpServletRequest request,Model model){
		
		
		String resultPage="login";
		if(validateUserData(user)){
			
			try{
				
				user = hotelServiceImpl.authenticateUser(user);
				
					
				if(user != null){
					String email=request.getParameter("email");
					
					request.getSession().setAttribute("uName",email);
					List<LoginBean> dbean=hotelServiceImpl.loadLoginDetails(email);
					for(LoginBean login:dbean){
						String desig=login.getDesignation();
						if(desig.equals("admin")){
							resultPage="admin";
						}
						else if(desig.equals("doctor")){
							resultPage="doctordashboard";
						}
						else if(desig.equals("Receptionist")){
							resultPage="hreceptionist";
						}
						else{
							request.getSession().setAttribute("message", "Please Enter Correct Credentials");
						}
					}
					
					
					request.getSession().setAttribute(ApplicationConstants.LOGIN_BEAN, user);
					
					
				}
			}catch(LoginExceptions loginException){
				resultPage = "login.jsp";
				request.setAttribute("message", loginException.getMessage());
			

		}
		}
		List<DoctorBean> dbean=adminServiceImpl.loadDoctorDetails();
		request.setAttribute("doctorlist",dbean);
		return resultPage;
	}

	private boolean validateUserData(LoginBean user){

		boolean valid = true;
		try{
			if(StringUtils.isBlank(user.getEmail())){
				return false;
			}
			if(StringUtils.isBlank(user.getPassword())){
				return false;
			}
		}catch(Exception e){
			e.getMessage();
		}
	
		return valid;
	}

	
}
