package com.hm.web.service;

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

}
