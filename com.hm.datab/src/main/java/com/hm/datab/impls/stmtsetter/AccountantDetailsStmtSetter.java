package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;

public class AccountantDetailsStmtSetter implements PreparedStatementSetter {
	;
	Doctor accountant = null;
	public AccountantDetailsStmtSetter(Doctor accountant){
		this.accountant = accountant;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
		
			ps.setString(1, accountant.getName());
			
			ps.setString(2, accountant.getAddress());
		
			ps.setString(3,accountant.getPhone());
			ps.setString(4, accountant.getEmail());
		}catch(Exception e)
		{
			
			throw new SQLException(e.getMessage());
		}
	}
}
