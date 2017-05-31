package com.hm.web.builder;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.hm.datab.beans.Login;
import com.hm.web.model.LoginBean;
import com.hm.web.util.ApplicationConstants;

@Component
public class LoginBuilder {
	
public Login buildUser(LoginBean regDetails){
		
		Login user = new Login();
		
		user.setCreatedDate(new Date());
		System.out.println("date"+new Date());
		
		
		user.setPassword(ApplicationConstants.USER_DEFAULT_PASSWORD);
		
		user.setEmail(regDetails.getEmail());
		
		user.setPassword(regDetails.getPassword());
		
		return user;
	}
public LoginBean buildUserBean(Login regDetails){
	
	LoginBean user = new LoginBean();
	
	user.setCreatedDate(new Date());
	System.out.println("date"+new Date());
	
	
	user.setPassword(ApplicationConstants.USER_DEFAULT_PASSWORD);
	
	user.setEmail(regDetails.getEmail());
	
	user.setPassword(regDetails.getPassword());
	
	return user;
}

}
