package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;


public class DoctorDetailsStmtSetter implements PreparedStatementSetter {
	
	Doctor doc= null;
	public DoctorDetailsStmtSetter(Doctor doc){
		this.doc = doc;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
			ps.setString(1,doc.getName());
			ps.setString(2, doc.getDept());
			ps.setString(3, doc.getPhone());
			ps.setString(4, doc.getAddress());
			ps.setString(5, doc.getEmail());
			
			ps.setInt(6, doc.getDid());
		}catch(Exception e)
		{
		
			throw new SQLException(e.getMessage());
		}
	}
}

