package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Doctor;
import com.hm.datab.beans.Receptionist;

public class RAmbulanceDetailsStmtSetter implements PreparedStatementSetter {
	
	Receptionist rec = null;
	public RAmbulanceDetailsStmtSetter(Receptionist rec){
		this.rec= rec;
	}
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
		
			ps.setString(1, rec.getAmbulancenumber());
			
			ps.setString(2, rec.getDriver());
			
			ps.setInt(3, rec.getAmbulanceid());
		}catch(Exception e)
		{
			
			throw new SQLException(e.getMessage());
		}
	}
}
