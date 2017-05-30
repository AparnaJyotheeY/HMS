package com.hm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceptionistController {

	@RequestMapping("/receptionist")
	public String showDoctor(HttpServletRequest req){
		

				return "receptionist";
	}

}
