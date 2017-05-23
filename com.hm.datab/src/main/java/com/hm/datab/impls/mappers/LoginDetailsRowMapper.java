package com.hm.datab.impls.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hm.datab.beans.Login;

public class LoginDetailsRowMapper implements RowMapper<Login> {

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Login user = new Login();
			
		user.setEmail(rs.getString("email"));	
		user.setPassword(rs.getString("password"));
		
		return user;
	}

}