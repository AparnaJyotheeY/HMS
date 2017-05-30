package com.hm.web.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.hm.datab.beans.Doctor;
import com.hm.datab.facade.impl.DoctorFunctionsFacade;
import com.hm.web.builder.DoctorBuilder;
import com.hm.web.model.DoctorBean;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private DoctorBuilder doctorBuilder;
	
	@Autowired
	private DoctorFunctionsFacade doctorFunctionsFacade;
	
	public DoctorBean saveDoctorDetails(DoctorBean dbean){
		Doctor doctor=doctorBuilder.buildDocotor(dbean);
		try {
			doctor=doctorFunctionsFacade.saveDoctorDetails(doctor) ;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbean=doctorBuilder.buildDocotorBean(doctor);
		
		return dbean;
	}
	
	public List<DoctorBean> loadDoctorDetails(){
		
		List<Doctor> dlist=doctorFunctionsFacade.loadDoctorDetails();
		List<DoctorBean> dbean=new ArrayList<DoctorBean>();
		for(Doctor doc:dlist){
			DoctorBean bean=new DoctorBean();
			bean.setDid(doc.getDid());
			bean.setName(doc.getName());
			bean.setEmail(doc.getEmail());
			bean.setDept(doc.getDept());
			bean.setPhone(doc.getPhone());
			bean.setAddress(doc.getAddress());
			bean.setProfile(doc.getProfile());
			StringBuilder sb = new StringBuilder();
			sb.append("data:image/jpeg;base64,");
			sb.append(Base64Utils.encodeToString(doc.getImage()));
			
			bean.setImages(sb.toString());
			dbean.add(bean);
		}
		return dbean;
	}
	
	public DoctorBean editDoctorDetails(DoctorBean dbean){
		Doctor doctor=doctorBuilder.buildDocotor(dbean);
		doctor=doctorFunctionsFacade.editDoctorDetails(doctor);
		dbean=doctorBuilder.buildDocotorBean(doctor);
		
		return dbean;
	}
	public DoctorBean saveNurseDetails(DoctorBean dbean){
		Doctor doctor=doctorBuilder.buildDocotor(dbean);
		doctor=doctorFunctionsFacade.saveNurseDetails(doctor);
		dbean=doctorBuilder.buildDocotorBean(doctor);
		
		return dbean;
	}


public List<DoctorBean> loadNurseDetails(){
		
		List<Doctor> dlist=doctorFunctionsFacade.loadNurseDetails();
		List<DoctorBean> dbean=new ArrayList<DoctorBean>();
		for(Doctor doc:dlist){
			DoctorBean bean=new DoctorBean();
			bean.setNurseid(doc.getNurseid());
			bean.setName(doc.getName());
			bean.setEmail(doc.getEmail());
			
			bean.setPhone(doc.getPhone());
			bean.setAddress(doc.getAddress());
			
			StringBuilder sb = new StringBuilder();
			sb.append("data:image/jpeg;base64,");
			sb.append(Base64Utils.encodeToString(doc.getImage()));
			
			bean.setImages(sb.toString());
			dbean.add(bean);
		}
		return dbean;
	}
public DoctorBean editNurseDetails(DoctorBean dbean){
	Doctor doctor=doctorBuilder.buildDocotor(dbean);
	doctor=doctorFunctionsFacade.editNurseDetails(doctor);
	dbean=doctorBuilder.buildDocotorBean(doctor);
	
	return dbean;
}
public String deleteNurseDetails(String email){
	
	String nemail=doctorFunctionsFacade.deleteNurseDetails(email);
	
	
	return nemail;
}
public DoctorBean savePhramacistDetails(DoctorBean dbean){
	Doctor doctor=doctorBuilder.buildDocotor(dbean);
	doctor=doctorFunctionsFacade.savePhramacisDetails(doctor);
	dbean=doctorBuilder.buildDocotorBean(doctor);
	
	return dbean;
}


public List<DoctorBean> loadPhramacistDetails(){
	
	List<Doctor> dlist=doctorFunctionsFacade.loadPhramacisDetails();
	List<DoctorBean> dbean=new ArrayList<DoctorBean>();
	for(Doctor doc:dlist){
		DoctorBean bean=new DoctorBean();
		bean.setPharmacistid(doc.getPharmacistid());
		bean.setName(doc.getName());
		bean.setEmail(doc.getEmail());
		
		bean.setPhone(doc.getPhone());
		bean.setAddress(doc.getAddress());
		
		StringBuilder sb = new StringBuilder();
		sb.append("data:image/jpeg;base64,");
		sb.append(Base64Utils.encodeToString(doc.getImage()));
		
		bean.setImages(sb.toString());
		dbean.add(bean);
	}
	return dbean;
}
public DoctorBean editPhramacistDetails(DoctorBean dbean){
Doctor doctor=doctorBuilder.buildDocotor(dbean);
doctor=doctorFunctionsFacade.editPhramacisDetails(doctor);
dbean=doctorBuilder.buildDocotorBean(doctor);

return dbean;
}
public String deletePhramacistDetails(String email){

String pemail=doctorFunctionsFacade.deletePhramacisDetails(email);


return pemail;
}
public DoctorBean saveAccountantDetails(DoctorBean dbean){
	Doctor doctor=doctorBuilder.buildDocotor(dbean);
	doctor=doctorFunctionsFacade.saveAccountantDetails(doctor);
	dbean=doctorBuilder.buildDocotorBean(doctor);
	
	return dbean;
}

public List<DoctorBean> loadAccountantDetails(){
	
	List<Doctor> dlist=doctorFunctionsFacade.loadAccountantDetails();
	List<DoctorBean> dbean=new ArrayList<DoctorBean>();
	for(Doctor doc:dlist){
		DoctorBean bean=new DoctorBean();
		bean.setAccountatid(doc.getAccountantid());
		bean.setName(doc.getName());
		bean.setEmail(doc.getEmail());
		
		bean.setPhone(doc.getPhone());
		bean.setAddress(doc.getAddress());
		
		StringBuilder sb = new StringBuilder();
		sb.append("data:image/jpeg;base64,");
		sb.append(Base64Utils.encodeToString(doc.getImage()));
		
		bean.setImages(sb.toString());
		dbean.add(bean);
	}
	return dbean;
}
public DoctorBean editAccountantDetails(DoctorBean dbean){
Doctor doctor=doctorBuilder.buildDocotor(dbean);
doctor=doctorFunctionsFacade.editAccountantDetails(doctor);
dbean=doctorBuilder.buildDocotorBean(doctor);

return dbean;
}
public String deleteAccountantDetails(String email){

String pemail=doctorFunctionsFacade.deleteAccountantDetails(email);


return pemail;
}
public DoctorBean savePatientDetails(DoctorBean dbean)
{
    Doctor doctor=doctorBuilder.buildPatient(dbean);
	doctor=doctorFunctionsFacade.savePatientDetails(doctor);
  dbean=doctorBuilder.buildPatientBean(doctor);
 return dbean;
}
public List<DoctorBean> loadPatientDetails()
{

	List<Doctor> dlist=doctorFunctionsFacade.loadPatientDetails();
	List<DoctorBean> dbean=new ArrayList<DoctorBean>();
	for(Doctor doc:dlist){
		DoctorBean bean=new DoctorBean();
		bean.setPid(doc.getPid());
		bean.setName(doc.getName());
		bean.setEmail(doc.getEmail());
		bean.setPhone(doc.getPhone());
		bean.setAddress(doc.getAddress());
		bean.setGender(doc.getGender());
		bean.setDob(doc.getDob());
		bean.setAge(doc.getAge());
		bean.setBloodgroup(doc.getBloodgroup());
		StringBuilder sb = new StringBuilder();
		sb.append("data:image/jpeg;base64,");
		sb.append(Base64Utils.encodeToString(doc.getImage()));
		bean.setImages(sb.toString());
		dbean.add(bean);
	}
	return dbean;
	

}

public DoctorBean editPatientDetails(DoctorBean dbean)
{
	 Doctor doctor=doctorBuilder.buildPatient(dbean);
	 doctor=doctorFunctionsFacade.editPatientDetails(doctor);
	 dbean=doctorBuilder.buildPatientBean(doctor);
	 return dbean;
}

public String deletePatientRecord(String email){   
	
	doctorFunctionsFacade.deletepatientDetails(email);

	return email;
}
public DoctorBean saveLaboratoristDetails(DoctorBean dbean){
	Doctor doctor=doctorBuilder.buildPatient(dbean);
	doctor=doctorFunctionsFacade.saveLaboratoristDetails(doctor);
	dbean=doctorBuilder.buildPatientBean(doctor);
	return dbean;
}

public List<DoctorBean> loadLaboratoristDetails(){
	
	List<Doctor> dlist=doctorFunctionsFacade.loadLaboratoristDetails();
	List<DoctorBean> dbean=new ArrayList<DoctorBean>();
	for(Doctor doc:dlist){
		DoctorBean bean=new DoctorBean();
		bean.setLid(doc.getLid());
		bean.setName(doc.getName());
		bean.setEmail(doc.getEmail());
		bean.setPhone(doc.getPhone());
		bean.setAddress(doc.getAddress());
		StringBuilder sb = new StringBuilder();
		sb.append("data:image/jpeg;base64,");
		sb.append(Base64Utils.encodeToString(doc.getImage()));
		bean.setImages(sb.toString());
		dbean.add(bean);
	}
	return dbean;
}

public DoctorBean editLaboratoristDetails(DoctorBean dbean)
{
	 Doctor doctor=doctorBuilder.buildPatient(dbean);
	 doctor=doctorFunctionsFacade.editLaboratoristDetails(doctor);
	 dbean=doctorBuilder.buildPatientBean(doctor);
	 return dbean;
}

public String deleteLaboratoristRecord(String email){   
	
	doctorFunctionsFacade.deleteLaboratoristDetails(email);

	return email;
}
}
