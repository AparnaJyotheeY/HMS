package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;

public class LaboratoristDetailsStmtSetter implements PreparedStatementSetter  {

	Doctor doc= null;
	public LaboratoristDetailsStmtSetter(Doctor doc){
		this.doc = doc;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
			ps.setString(1,doc.getName());
			ps.setString(2, doc.getEmail());
			ps.setString(3, doc.getPhone());
			ps.setString(4, doc.getAddress());
			ps.setInt(5, doc.getLid());
		}catch(Exception e)
		{
		
			throw new SQLException(e.getMessage());
		}
	}
}
