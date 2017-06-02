package com.hm.datab.dao.impl;

import java.io.UnsupportedEncodingException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.hm.datab.beans.Receptionist;
import com.hm.datab.dao.ReceptionistDAO;
import com.hm.datab.impls.mappers.RAmbulanceDetailsRowMapper;
import com.hm.datab.impls.mappers.RAmbulanceFuelDetailsRowMapper;
import com.hm.datab.impls.stmtsetter.RAmbulanceFuelDetailsUpdateStmtSetter;
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
			recordParameters.put("addeddate", new Date());
			
			jdbcInsert.withTableName("ambulancedetails")
			.usingGeneratedKeyColumns("ambulanceid");	
			recep.setAmbulanceid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
				
			return recep;
	}

	public String saveRAmbulanceOutDetails(String anumber) throws UnsupportedEncodingException{
		String saveOutTimeQuery = dbProps.getProperty(DBConstants.SAVE_OUTTIME);
		
		 Object[] params = {anumber};
		 int[] types = {Types.VARCHAR};
		
		int numberRecordsUpdated = jdbcTemplate.update(saveOutTimeQuery,params,types);
		return anumber;
	}
public List<Receptionist> loadRAmbulanceDetails(){
		
		List<Receptionist> rbean = new ArrayList<Receptionist>();
		String loadReceptionistDetailsQuery = dbProps.getProperty(DBConstants.LOAD_RAMBULANCE_DETAILS );
		rbean = jdbcTemplate.query(loadReceptionistDetailsQuery, new RAmbulanceDetailsRowMapper());
		
		return rbean;
	}

public Receptionist saveRPatientAppointmentDetails(Receptionist recep)
{
	DataSource dataSource = jdbcTemplate.getDataSource();
	SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
	System.out.println("jdbc"+jdbcInsert);
	Map<String,Object> recordParameters = new HashMap<String,Object>();
	recordParameters.put("pid",recep.getPid());
	recordParameters.put("apdate", recep.getAddedDate());
	recordParameters.put("aptime", recep.getAppTime());
	recordParameters.put("casehistory", recep.getCaseHistory());
	recordParameters.put("medication", recep.getMedication());
	recordParameters.put("note", recep.getNote());
	jdbcInsert.withTableName("appointmentlist")
	.usingGeneratedKeyColumns("aid");	
	recep.setPid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());
		
	return recep;
}
public Receptionist saveRAmbulanceFuelExpensesDetails(Receptionist recep)
{
	DataSource dataSource = jdbcTemplate.getDataSource();
	SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
	Map<String,Object> recordParameters = new HashMap<String,Object>();
	recordParameters.put("ambulancenumber",recep.getAmbulancenumber());
    recordParameters.put("driver", recep.getDriver());
    recordParameters.put("fueldate", recep.getAddedDate());
    recordParameters.put("fueltime", recep.getAppTime());
    recordParameters.put("fuelquantity", recep.getFuelquantity());
    recordParameters.put("fuelamount", recep.getFuelamount());
    
    jdbcInsert.withTableName("ambulancefueldetails")
	.usingGeneratedKeyColumns("ambulanceid");	
	recep.setAmbulanceid(jdbcInsert.executeAndReturnKey(recordParameters).intValue());

	return recep;
	
}

public List<Receptionist> loadRAmbulacneFuelDetails()
{

	String fuelquery=dbProps.getProperty(DBConstants.LOAD_RAMBULANCEFUEL_DETAILS);
	List<Receptionist> fueldetails=jdbcTemplate.query(fuelquery,new RAmbulanceFuelDetailsRowMapper());
	return fueldetails;
}

public Receptionist updateRAmbulanceFuelDetails(Receptionist recep)
{
	
String updateFuel=dbProps.getProperty(DBConstants.UPDATE_RAMBULANCEFUEL_DETAILS);
int updaterecords=jdbcTemplate.update(updateFuel, new RAmbulanceFuelDetailsUpdateStmtSetter(recep));

return recep;
}
public String deleteRAmbulanceFuelRecordDetails(String ambno)
{     
	
	 
	 String deleteFuel=dbProps.getProperty(DBConstants.DELETE_RAMBULANCEFUEL_DETAILS);
    int deleteRecords=jdbcTemplate.update(deleteFuel, new Object[]{ambno}); 

    return ambno;
}


}
