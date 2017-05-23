package com.hm.datab.dao.impl;

import java.security.Security;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.hm.datab.beans.Doctor;
import com.hm.datab.dao.DoctorDAO;
import com.hm.datab.impls.mappers.DoctorDetailsRowMapper;
import com.hm.datab.impls.stmtsetter.DoctorDetailsStmtSetter;
import com.hm.datab.util.DBConstants;

@Repository
public class DoctorDAOImpl implements DoctorDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Properties dbProps;
	

	
	public Doctor saveDoctorDetails(Doctor doctor){
		DataSource dataSource = jdbcTemplate.getDataSource();
		System.out.println("datasource"+dataSource);
		//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
			System.out.println("jdbc"+jdbcInsert);

			Map<String,Object> recordParameters = new HashMap<String,Object>();
			recordParameters.put("name", doctor.getName());
			recordParameters.put("email", doctor.getEmail());
			recordParameters.put("password",doctor.getPassword());
			recordParameters.put("phone", doctor.getPhone());
			recordParameters.put("department", doctor.getDept());
			recordParameters.put("profile",doctor.getProfile());
			recordParameters.put("address", doctor.getAddress());
			recordParameters.put("addeddate", new Date());
			recordParameters.put("image", doctor.getImage());
			
			jdbcInsert.withTableName("doctorslist")
			.usingGeneratedKeyColumns("doctorid");	
			doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
				
			return doctor;
	}
	
	public Doctor saveDoctorCredentials(Doctor doctor){
		DataSource dataSource = jdbcTemplate.getDataSource();
		System.out.println("datasource"+dataSource);
		//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
			System.out.println("jdbc"+jdbcInsert);
			Map<String,Object> recordParameters = new HashMap<String,Object>();
			recordParameters.put("email", doctor.getEmail());
			recordParameters.put("password",doctor.getPassword());
			recordParameters.put("createddate", new Date());
			recordParameters.put("designation", "doctor");
			
			jdbcInsert.withTableName("login")
			.usingGeneratedKeyColumns("loginid");	
			doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
			
			return doctor;
				
	}
	
	public List<Doctor> loadDoctorDetails(){
		
		List<Doctor> dbean = new ArrayList<Doctor>();
		String loadDoctorDetailsQuery = dbProps.getProperty(DBConstants.LOAD_DOCTOR_DETAILS );
		dbean = jdbcTemplate.query(loadDoctorDetailsQuery, new DoctorDetailsRowMapper());
		
		return dbean;
	}
	public Doctor editDoctorDetails(Doctor doctor) {
		int did=doctor.getDid();
		String updateQuery = dbProps.getProperty(DBConstants.EDIT_DOCTOR_DETAILS);
		int numberRecordsUpdated = jdbcTemplate.update(updateQuery,new Object[] {did}, new DoctorDetailsStmtSetter(doctor));
		
		return doctor;
						
	}
}
