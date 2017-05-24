package com.hm.web.service;

import com.hm.web.exceptions.LoginExceptions;
import com.hm.web.model.LoginBean;

public interface HotelService {
	public LoginBean authenticateUser(LoginBean userBean) throws LoginExceptions;
}