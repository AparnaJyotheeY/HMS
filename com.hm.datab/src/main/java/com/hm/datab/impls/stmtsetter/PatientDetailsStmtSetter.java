package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;

public class PatientDetailsStmtSetter implements PreparedStatementSetter {

	
	Doctor doc= null;
	public PatientDetailsStmtSetter(Doctor doc){
		this.doc = doc;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
			ps.setString(1,doc.getName());
			ps.setString(2, doc.getEmail());
			ps.setInt(3, doc.getAge());
			ps.setString(4, doc.getAddress());
			ps.setString(5, doc.getBloodgroup());
			ps.setString(6, doc.getPhone());			
			ps.setInt(7, doc.getPid());
		}catch(Exception e)
		{
		
			throw new SQLException(e.getMessage());
		}
	}
}
