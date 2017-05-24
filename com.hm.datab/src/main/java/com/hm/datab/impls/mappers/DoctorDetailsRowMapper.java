package com.hm.datab.impls.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hm.datab.beans.Doctor;
import com.hm.datab.beans.Login;

public class DoctorDetailsRowMapper implements RowMapper<Doctor> {

	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Doctor doc = new Doctor();
			doc.setName(rs.getString("name"));
			doc.setAddeddate(rs.getDate("addeddate"));
			doc.setAddress(rs.getString("address"));
			doc.setDept(rs.getString("department"));
			doc.setDid(rs.getInt("did"));
			doc.setEmail(rs.getString("email"));
			doc.setPhone(rs.getString("phone"));
			doc.setProfile(rs.getString("profile"));
			doc.setImage(rs.getBytes("image"));
		
		return doc;
	}

}