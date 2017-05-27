package com.hm.datab.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hm.datab.beans.Doctor;
import com.hm.datab.beans.Login;
import com.hm.datab.dao.LoginDAO;
import com.hm.datab.impls.mappers.AccountantDetailsRowMapper;
import com.hm.datab.impls.mappers.LoginDetailsRowMapper;
import com.hm.datab.util.DBConstants;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Properties dbProps;
	
	public Login loadUserLogin(Login user){	
		
		Login userData = null;
		String loadUserLoginQuery = dbProps.getProperty(DBConstants.LOAD_USER_LOGIN);
		List<Login> users = jdbcTemplate.query(loadUserLoginQuery,new Object[]{user.getEmail(),user.getPassword()}, new LoginDetailsRowMapper());
		
		if(users != null && users.size() > 0){
			userData = users.get(0);
		}
		
		return userData;
	
}
	public List<Login> loadLoginDetails(String email){
		List<Login> dbean = new ArrayList<Login>();
		String loadLoginDetailsQuery = dbProps.getProperty(DBConstants.LOAD_LOGIN_DETAILS );
		dbean = jdbcTemplate.query(loadLoginDetailsQuery, new LoginDetailsRowMapper());
		
		return dbean;
	}
}
