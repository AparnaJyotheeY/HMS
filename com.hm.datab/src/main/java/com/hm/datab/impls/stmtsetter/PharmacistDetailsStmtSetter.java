package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;

public class PharmacistDetailsStmtSetter implements PreparedStatementSetter {
	
	Doctor pharmacist = null;
	public PharmacistDetailsStmtSetter(Doctor pharmacist){
		this.pharmacist = pharmacist;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
		
			ps.setString(1, pharmacist.getName());
			
			ps.setString(2, pharmacist.getAddress());
		
			ps.setString(3,pharmacist.getPhone());
			ps.setString(4, pharmacist.getEmail());
		}catch(Exception e)
		{
			
			throw new SQLException(e.getMessage());
		}
	}
}
