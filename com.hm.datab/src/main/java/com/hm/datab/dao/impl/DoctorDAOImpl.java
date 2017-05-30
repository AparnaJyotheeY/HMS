package com.hm.datab.dao.impl;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.hm.datab.beans.Doctor;
import com.hm.datab.dao.DoctorDAO;
import com.hm.datab.impls.mappers.AccountantDetailsRowMapper;
import com.hm.datab.impls.mappers.DoctorDetailsRowMapper;
import com.hm.datab.impls.mappers.LaboratoristDetailsRowMapper;
import com.hm.datab.impls.mappers.NurseDetailsRowMapper;
import com.hm.datab.impls.mappers.PatientDetailsRowMapper;
import com.hm.datab.impls.mappers.PharmacistDetailsRowMapper;
import com.hm.datab.impls.stmtsetter.AccountantDetailsStmtSetter;
import com.hm.datab.impls.stmtsetter.DoctorDetailsStmtSetter;
import com.hm.datab.impls.stmtsetter.LaboratoristDetailsStmtSetter;
import com.hm.datab.impls.stmtsetter.NurseDetailsStmtSetter;
import com.hm.datab.impls.stmtsetter.PatientDetailsStmtSetter;
import com.hm.datab.impls.stmtsetter.PharmacistDetailsStmtSetter;
import com.hm.datab.util.DBConstants;

@Repository
public class DoctorDAOImpl implements DoctorDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Properties dbProps;
	

	
	public Doctor saveDoctorDetails(Doctor doctor) throws UnsupportedEncodingException{
		DataSource dataSource = jdbcTemplate.getDataSource();
		System.out.println("datasource"+dataSource);
		//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
			System.out.println("jdbc"+jdbcInsert);

			Map<String,Object> recordParameters = new HashMap<String,Object>();
			recordParameters.put("name", doctor.getName());
			recordParameters.put("email", doctor.getEmail());
			 String base64encodedString = Base64.getEncoder().encodeToString(doctor.getPassword().getBytes("utf-8"));
			recordParameters.put("password",base64encodedString);
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
	public Doctor saveNurseDetails(Doctor doctor){
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
			
			
			recordParameters.put("address", doctor.getAddress());
			recordParameters.put("addeddate", new Date());
			recordParameters.put("image", doctor.getImage());
			
			jdbcInsert.withTableName("nurse")
			.usingGeneratedKeyColumns("nurseid");	
			doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
				
			return doctor;
	}
	
	public Doctor saveNurseCredentials(Doctor doctor){
		DataSource dataSource = jdbcTemplate.getDataSource();
		System.out.println("datasource"+dataSource);
		//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
			System.out.println("jdbc"+jdbcInsert);
			Map<String,Object> recordParameters = new HashMap<String,Object>();
			recordParameters.put("email", doctor.getEmail());
			recordParameters.put("password",doctor.getPassword());
			recordParameters.put("createddate", new Date());
			recordParameters.put("designation", "nurse");
			
			jdbcInsert.withTableName("login")
			.usingGeneratedKeyColumns("loginid");	
			doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
			
			return doctor;
				
	}
public List<Doctor> loadNurseDetails(){
		
		List<Doctor> dbean = new ArrayList<Doctor>();
		String loadNurseDetailsQuery = dbProps.getProperty(DBConstants.LOAD_NURSE_DETAILS );
		dbean = jdbcTemplate.query(loadNurseDetailsQuery, new NurseDetailsRowMapper());
		
		return dbean;
	}
public Doctor editNurseDetails(Doctor doctor) {
	
	String updateQuery = dbProps.getProperty(DBConstants.EDIT_NURSE_DETAILS);
	int numberRecordsUpdated = jdbcTemplate.update(updateQuery, new NurseDetailsStmtSetter(doctor));
	
	return doctor;
					
}
public String deleteNurseDetails(String email) {
	
	String deleteQuery = dbProps.getProperty(DBConstants.DELETE_NURSE_DETAILS);
	int numberRecordsUpdated = jdbcTemplate.update(deleteQuery, new Object[]{email});
	
	return email;
					
}
public Doctor savePhramacisDetails(Doctor doctor){
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
		
		
		recordParameters.put("address", doctor.getAddress());
		recordParameters.put("addeddate", new Date());
		recordParameters.put("image", doctor.getImage());
		
		jdbcInsert.withTableName("pharmacist")
		.usingGeneratedKeyColumns("pharmacistid");	
		doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
			
		return doctor;
}

public Doctor savePhramacisCredentials(Doctor doctor){
	DataSource dataSource = jdbcTemplate.getDataSource();
	System.out.println("datasource"+dataSource);
	//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
		System.out.println("jdbc"+jdbcInsert);
		Map<String,Object> recordParameters = new HashMap<String,Object>();
		recordParameters.put("email", doctor.getEmail());
		recordParameters.put("password",doctor.getPassword());
		recordParameters.put("createddate", new Date());
		recordParameters.put("designation", "pharmacist");
		
		jdbcInsert.withTableName("login")
		.usingGeneratedKeyColumns("loginid");	
		doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
		
		return doctor;
			
}
public List<Doctor> loadPhramacisDetails(){
	
	List<Doctor> dbean = new ArrayList<Doctor>();
	String loadNurseDetailsQuery = dbProps.getProperty(DBConstants.LOAD_PHARMACIST_DETAILS );
	dbean = jdbcTemplate.query(loadNurseDetailsQuery, new PharmacistDetailsRowMapper());
	
	return dbean;
}
public Doctor editPhramacisDetails(Doctor doctor) {

String updateQuery = dbProps.getProperty(DBConstants.EDIT_PHARMACIST_DETAILS);
int numberRecordsUpdated = jdbcTemplate.update(updateQuery, new PharmacistDetailsStmtSetter(doctor));

return doctor;
				
}
public String deletePhramacisDetails(String email) {

String deleteQuery = dbProps.getProperty(DBConstants.DELETE_PHARMACIST_DETAILS);
int numberRecordsUpdated = jdbcTemplate.update(deleteQuery, new Object[]{email});

return email;
				
}

public Doctor saveAccountantDetails(Doctor doctor){
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
		
		
		recordParameters.put("address", doctor.getAddress());
		recordParameters.put("addeddate", new Date());
		recordParameters.put("image", doctor.getImage());
		
		jdbcInsert.withTableName("accountant")
		.usingGeneratedKeyColumns("accountantid");	
		doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
			
		return doctor;
}

public Doctor saveAccountantCredentials(Doctor doctor){
	DataSource dataSource = jdbcTemplate.getDataSource();
	System.out.println("datasource"+dataSource);
	//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
		System.out.println("jdbc"+jdbcInsert);
		Map<String,Object> recordParameters = new HashMap<String,Object>();
		recordParameters.put("email", doctor.getEmail());
		recordParameters.put("password",doctor.getPassword());
		recordParameters.put("createddate", new Date());
		recordParameters.put("designation", "Accountant");
		
		jdbcInsert.withTableName("login")
		.usingGeneratedKeyColumns("loginid");	
		doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
		
		return doctor;
			
}
public List<Doctor> loadAccountantDetails(){
	
	List<Doctor> dbean = new ArrayList<Doctor>();
	String loadNurseDetailsQuery = dbProps.getProperty(DBConstants.LOAD_ACCOUNTANT_DETAILS );
	dbean = jdbcTemplate.query(loadNurseDetailsQuery, new AccountantDetailsRowMapper());
	
	return dbean;
}
public Doctor editAccountantDetails(Doctor doctor) {

String updateQuery = dbProps.getProperty(DBConstants.EDIT_ACCOUNTANT_DETAILS);
int numberRecordsUpdated = jdbcTemplate.update(updateQuery, new AccountantDetailsStmtSetter(doctor));

return doctor;
				
}
public String deleteAccountantDetails(String email) {

String deleteQuery = dbProps.getProperty(DBConstants.DELETE_ACCOUNTANT_DETAILS);
int numberRecordsUpdated = jdbcTemplate.update(deleteQuery, new Object[]{email});

return email;
				
}
public Doctor savePatientDetails(Doctor doctor)
{
	DataSource dataSource = jdbcTemplate.getDataSource();
	SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
	Map<String,Object> recordParameters = new HashMap<String,Object>();
	recordParameters.put("name", doctor.getName());
	recordParameters.put("email", doctor.getEmail());
	recordParameters.put("password",doctor.getPassword());
	recordParameters.put("address", doctor.getAddress());
	recordParameters.put("mobileno", doctor.getPhone());
	recordParameters.put("gender", doctor.getGender());
	recordParameters.put("dob", doctor.getDob());
	recordParameters.put("age", doctor.getAge());
	recordParameters.put("addeddate",doctor.getAddeddate());
	recordParameters.put("image", doctor.getImage());
	recordParameters.put("bloodgroup", doctor.getBloodgroup());
  
	jdbcInsert.withTableName("patientlist")
	.usingGeneratedKeyColumns("pid");	
	doctor.setPid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
	
	return doctor;
}

public Doctor savePatientCredentials(Doctor doctor)
{
	DataSource dataSource = jdbcTemplate.getDataSource();
	SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
	Map<String,Object> recordParameters = new HashMap<String,Object>();
	recordParameters.put("email", doctor.getEmail());
	recordParameters.put("password",doctor.getPassword());
	recordParameters.put("createddate", new Date());
	recordParameters.put("designation", "patient");
	jdbcInsert.withTableName("login")
	.usingGeneratedKeyColumns("loginid");	
	doctor.setPid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
	
	return doctor;
		
	




}
public List<Doctor> loadPatientDetails()
{
	
  String query=dbProps.getProperty(DBConstants.LOAD_PATIENT_DETAILS );
  List<Doctor> bean=jdbcTemplate.query(query,new PatientDetailsRowMapper());
  
  return bean;
}
public Doctor editPatientDetails(Doctor doctor)
{

String updateQuery=dbProps.getProperty(DBConstants.EDIT_PATIENT_DETAILS );
int numberRecordsUpdated=jdbcTemplate.update(updateQuery, new PatientDetailsStmtSetter(doctor));

return doctor;
}
	
public String deletePatientRecord(String email)
{
	Doctor doc=null;
	String deleteQuery=dbProps.getProperty(DBConstants.DELETE_PATIENT_DETAILS );
	
	int norecdeleted=jdbcTemplate.update(deleteQuery,new Object[]{email});
	
return email;
}

public Doctor saveLaboratoristDetails(Doctor doctor){
	DataSource dataSource = jdbcTemplate.getDataSource();
	System.out.println("datasource"+dataSource);
	//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
		System.out.println("jdbc"+jdbcInsert);

		Map<String,Object> recordParameters = new HashMap<String,Object>();
		recordParameters.put("name", doctor.getName());
		recordParameters.put("email", doctor.getEmail());
		recordParameters.put("password",doctor.getPassword());
		recordParameters.put("phoneno", doctor.getPhone());
		recordParameters.put("address", doctor.getAddress());
		recordParameters.put("addeddate", new Date());
		recordParameters.put("image", doctor.getImage());
		
		jdbcInsert.withTableName("Laboratoristlist")
		.usingGeneratedKeyColumns("lid");	
		doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
			
		return doctor;
}
public Doctor saveLaboratoristCredentials(Doctor doctor){
	DataSource dataSource = jdbcTemplate.getDataSource();
	System.out.println("datasource"+dataSource);
	//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
		System.out.println("jdbc"+jdbcInsert);
		Map<String,Object> recordParameters = new HashMap<String,Object>();
		recordParameters.put("email", doctor.getEmail());
		recordParameters.put("password",doctor.getPassword());
		recordParameters.put("createddate", new Date());
		recordParameters.put("designation", "laboratorist");
		
		jdbcInsert.withTableName("login")
		.usingGeneratedKeyColumns("loginid");	
		doctor.setDid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
		
		return doctor;
			
}
public List<Doctor> loadLaboratoristDetails(){
	
	List<Doctor> dbean = new ArrayList<Doctor>();
	String loadLaboratoristDetailsQuery = dbProps.getProperty(DBConstants.LOAD_LABORATORIST_DETAILS );
	dbean = jdbcTemplate.query(loadLaboratoristDetailsQuery, new LaboratoristDetailsRowMapper());
	
	return dbean;
}
public Doctor editLaboratoristDetails(Doctor doctor)
{

String updateQuery=dbProps.getProperty(DBConstants.EDIT_LABORATORIST_DETAILS);
int numberRecordsUpdated=jdbcTemplate.update(updateQuery, new LaboratoristDetailsStmtSetter(doctor));

return doctor;
}
public String deleteLaboratoristRecord(String email)
{
	Doctor doc=null;
	String deleteQuery=dbProps.getProperty(DBConstants.DELETE_LABORATORIST_DETAILS );
	
	int norecdeleted=jdbcTemplate.update(deleteQuery,new Object[]{email});
	
return email;
}
	
}
