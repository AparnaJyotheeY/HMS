package com.hm.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.datab.beans.Login;
import com.hm.datab.facade.impl.HotelFunctionsFacade;
import com.hm.web.builder.LoginBuilder;
import com.hm.web.exceptions.ExceptionConstants;
import com.hm.web.exceptions.LoginExceptions;
import com.hm.web.model.LoginBean;

@Service
public class HotelServiceImpl {

	@Autowired
	private HotelFunctionsFacade hotelFunctionsFacade;
	
	@Autowired
	private LoginBuilder loginBuilder;
	
	
	public LoginBean authenticateUser(LoginBean userBean) throws LoginExceptions {

		Login user = loginBuilder.buildUser(userBean);
		user = hotelFunctionsFacade.authenticateUser(user);
		
		
		if (user == null) {
			throw new LoginExceptions(ExceptionConstants.INVALID_USER_LOGIN,
					ExceptionConstants.INVALID_USER_LOGIN_CODE);
		}

		return userBean;
	}
	
	public List<LoginBean> loadLoginDetails(String email){
		List<Login> login=hotelFunctionsFacade.loadLoginDetails(email);
		List<LoginBean> lbean= new ArrayList<LoginBean>();
		for(Login bean: login){
			LoginBean log=new LoginBean();
			log.setDesignation(bean.getDesig());
			lbean.add(log);
		}
		return lbean;
	}

}
