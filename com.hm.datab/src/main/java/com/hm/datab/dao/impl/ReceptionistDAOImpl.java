package com.hm.datab.dao.impl;

import java.io.UnsupportedEncodingException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.hm.datab.beans.Receptionist;
import com.hm.datab.dao.ReceptionistDAO;
import com.hm.datab.util.DBConstants;

@Repository
public class ReceptionistDAOImpl implements ReceptionistDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Properties dbProps;
	

	
	public Receptionist saveRAmbulanceDetails(Receptionist recep) throws UnsupportedEncodingException{
		DataSource dataSource = jdbcTemplate.getDataSource();
		System.out.println("datasource"+dataSource);
		//System.out.println("regddd"+userDetails.getContactNo()+userDetails.getFamilyDetails()+userDetails.getNoFamilyMembers()+userDetails.getParkingNo());
			SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
			System.out.println("jdbc"+jdbcInsert);

			Map<String,Object> recordParameters = new HashMap<String,Object>();
			recordParameters.put("ambulancenumber", recep.getAmbulancenumber());
			recordParameters.put("driver", recep.getDriver());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
recordParameters.put("outtime", sdf.format(new Date()));
			recordParameters.put("status", "engaged");
		
			
			jdbcInsert.withTableName("ambulancedetails")
			.usingGeneratedKeyColumns("ambulanceid");	
			recep.setAmbulanceid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
				
			return recep;
	}

	public String saveRAmbulanceOutDetails(String anumber) throws UnsupportedEncodingException{
		String saveOutTimeQuery = dbProps.getProperty(DBConstants.SAVE_OUTTIME);
		String status="available";
		 Object[] params = {anumber,status};
		 int[] types = {Types.VARCHAR,Types.VARCHAR};
		
		int numberRecordsUpdated = jdbcTemplate.update(saveOutTimeQuery,params,types);
		return anumber;
	}
	
}