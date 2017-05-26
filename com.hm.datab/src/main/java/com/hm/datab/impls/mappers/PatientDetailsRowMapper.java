package com.hm.datab.impls.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hm.datab.beans.Doctor;

public class PatientDetailsRowMapper implements RowMapper<Doctor> {

	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Doctor doc = new Doctor();
		doc.setName(rs.getString("name"));
		doc.setAddeddate(rs.getDate("addeddate"));
		doc.setAddress(rs.getString("address"));
		doc.setPid(rs.getInt("pid"));
		doc.setEmail(rs.getString("email"));
		doc.setPhone(rs.getString("mobileno"));
		doc.setImage(rs.getBytes("image"));
		doc.setGender(rs.getString("gender"));
		doc.setDob(rs.getDate("dob"));
		doc.setAge(rs.getInt("age"));
		doc.setBloodgroup(rs.getString("bloodgroup"));
		return doc;
		
		
	}
}
