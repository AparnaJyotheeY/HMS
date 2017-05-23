package com.hm.web.service;

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
		doctor=doctorFunctionsFacade.saveDoctorDetails(doctor);
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

}
