package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;

public class NurseDetailsStmtSetter implements PreparedStatementSetter {
	
	Doctor nurse = null;
	public NurseDetailsStmtSetter(Doctor nurse){
		this.nurse = nurse;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
		
			ps.setString(1, nurse.getName());
			
			ps.setString(2, nurse.getAddress());
		
			ps.setString(3,nurse.getPhone());
			ps.setString(4, nurse.getEmail());
		}catch(Exception e)
		{
			
			throw new SQLException(e.getMessage());
		}
	}

}
