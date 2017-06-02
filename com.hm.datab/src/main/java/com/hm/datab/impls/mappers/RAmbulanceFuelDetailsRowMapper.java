package com.hm.datab.impls.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hm.datab.beans.Receptionist;

public class RAmbulanceFuelDetailsRowMapper implements RowMapper<Receptionist> {

	
public Receptionist mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Receptionist rec =  new Receptionist();
		rec.setAmbulanceid(rs.getInt("ambulanceid"));
		rec.setAmbulancenumber(rs.getString("ambulancenumber"));
		rec.setDriver(rs.getString("driver"));
		rec.setAddedDate(rs.getDate("fueldate"));
		rec.setFuelquantity(rs.getInt("fuelquantity"));
		rec.setFuelamount(rs.getInt("fuelamount"));
		return rec;
	}
	
	
}

