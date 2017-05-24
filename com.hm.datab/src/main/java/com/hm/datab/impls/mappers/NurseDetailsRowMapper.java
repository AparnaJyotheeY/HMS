package com.hm.datab.impls.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hm.datab.beans.Doctor;

public class NurseDetailsRowMapper implements RowMapper<Doctor> {

	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Doctor doc = new Doctor();
			doc.setName(rs.getString("name"));
			doc.setAddeddate(rs.getDate("addeddate"));
			doc.setAddress(rs.getString("address"));
			
			doc.setDid(rs.getInt("nurseid"));
			doc.setEmail(rs.getString("email"));
			doc.setPhone(rs.getString("phone"));
			
			doc.setImage(rs.getBytes("image"));
		
		return doc;
	}

}