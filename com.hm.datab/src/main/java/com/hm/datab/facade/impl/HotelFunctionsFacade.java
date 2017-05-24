package com.hm.datab.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.datab.beans.Login;
import com.hm.datab.dao.LoginDAO;
import com.hm.datab.facade.HotelFunctions;

@Component
public class HotelFunctionsFacade implements HotelFunctions{

	@Autowired
	private LoginDAO loginDAOImpl;

	public Login authenticateUser(Login user) {

		user = loginDAOImpl.loadUserLogin(user);
		return user;
	}

}
