package com.hm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorController {
	
	@RequestMapping("/doctor")
	public String showDoctor(HttpServletRequest req){
		

				return "doctordashboard";
	}

}
