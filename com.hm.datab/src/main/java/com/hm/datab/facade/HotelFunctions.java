package com.hm.datab.facade;

import java.util.List;

import com.hm.datab.beans.Login;

public interface HotelFunctions {

	public Login authenticateUser(Login user);
	
	public List<Login> loadLoginDetails(String email);
}
