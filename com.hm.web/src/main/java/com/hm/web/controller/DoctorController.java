package com.hm.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class DoctorController {
	
	@RequestMapping("/doctor")
	public String showDoctor(HttpServletRequest req){
		

				return "doctordashboard";
	}

}
