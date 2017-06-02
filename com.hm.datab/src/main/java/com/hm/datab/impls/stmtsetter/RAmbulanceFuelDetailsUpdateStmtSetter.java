package com.hm.datab.impls.stmtsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.hm.datab.beans.Receptionist;

public class RAmbulanceFuelDetailsUpdateStmtSetter implements PreparedStatementSetter {
	
	
	Receptionist rec=null;

	public RAmbulanceFuelDetailsUpdateStmtSetter(Receptionist rec) {
	
		this.rec = rec;
	}
	
	public void setValues(PreparedStatement ps) throws SQLException {
		try{
		
			ps.setString(1, rec.getDriver());
			
			ps.setDate(2, new java.sql.Date(rec.getAddedDate().getTime()));
			ps.setInt(3,rec.getFuelquantity());
			ps.setInt(4, rec.getFuelamount());
			ps.setString(5, rec.getAmbulancenumber());
		}catch(Exception e)
		{
			
			throw new SQLException(e.getMessage());
		}
	}

}
