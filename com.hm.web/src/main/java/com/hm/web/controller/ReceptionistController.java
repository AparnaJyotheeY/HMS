package com.hm.web.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hm.web.model.DoctorBean;
import com.hm.web.model.ReceptionistBean;
import com.hm.web.service.AdminServiceImpl;
import com.hm.web.service.ReceptionistServiceImpl;

@Controller
public class ReceptionistController {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	@Autowired
	private ReceptionistServiceImpl receptionistServiceImpl;

	@RequestMapping("/receptionist")
	public String showReceptionist(HttpServletRequest req){
		

				return "hreceptionist";
	}
	
	
	
	
	@RequestMapping("/addrpatient")
	public String showPatient(HttpServletRequest req)
	{
		List<DoctorBean> dbean=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dbean);
		return "rpatient";	
	}
	
	@RequestMapping(value="/rpatientdetails",method=RequestMethod.POST)
	public String addPatient(@RequestParam("image") MultipartFile file,HttpServletRequest req) throws Exception
	{
		DoctorBean dbean=buildPatient(req);
     try {
			
			if (!file.isEmpty()) {
				byte[] pictureBytes = file.getBytes();					
			
					
					dbean.setImage(pictureBytes);
			}
			
		}catch(Exception e){
			req.setAttribute("message", "Improper Data");
			return "addpatient" ;
		}
     List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
     req.setAttribute("patientlist",dlist);
	
     dbean=adminServiceImpl.savePatientDetails(dbean);
     req.setAttribute("successmessage", "patient details added successfully");
     return "rpatient" ;
	}
	public DoctorBean buildPatient(HttpServletRequest req) throws Exception
	{
		DoctorBean dbean =new DoctorBean();
		dbean.setName(req.getParameter("name"));
		dbean.setEmail(req.getParameter("email"));
		dbean.setPassword(req.getParameter("password"));
		dbean.setAddress(req.getParameter("address"));
		dbean.setPhone(req.getParameter("phoneno"));
		dbean.setGender(req.getParameter("gender"));
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		dbean.setDob(format.parse(req.getParameter("dob")));
		dbean.setAge(Integer.parseInt(req.getParameter("age")));
		dbean.setBloodgroup(req.getParameter("bloodgroup"));
		dbean.setAddeddate(new Date());
		return dbean;
		
	}
	@RequestMapping(value="/erpatientdetails",method=RequestMethod.POST)
	public String editPatientDetails(HttpServletRequest req)
	{
		DoctorBean dbean=buildEditpatientDetails(req);
		
		List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dlist);
		
		dbean=adminServiceImpl.editPatientDetails(dbean);
		req.setAttribute("successmessage", "doctor details updated successfully");
		return "rpatient";
	}
	
	public DoctorBean buildEditpatientDetails(HttpServletRequest req)
	{
		DoctorBean dbean=new DoctorBean();
		dbean.setAddeddate(new Date());
		dbean.setPid(Integer.valueOf(req.getParameter("pid")));
		dbean.setName(req.getParameter("pname"));
		dbean.setEmail(req.getParameter("pemail"));
		dbean.setAge(Integer.parseInt(req.getParameter("page")));
		dbean.setBloodgroup(req.getParameter("bloodgroup"));
		dbean.setAddress(req.getParameter("paddress"));
		dbean.setPhone(req.getParameter("pphone"));
		return dbean;
	}
	
	@RequestMapping("/exportdrpexcel")
	public ModelAndView getPatientExcel(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("PatientExcel", "patient",dlist);
	}

	@RequestMapping("/exportrpdpdf")
	public ModelAndView getpatientpdf(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("PatientPdf", "patient",dlist);
	}
	
	@RequestMapping("/deleterpatient")
	public String deletePatientRecord(HttpServletRequest req)
	{
		String email=req.getParameter("demail");
		List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dlist);
		adminServiceImpl.deletePatientRecord(email);
		
		return "rpatient";
		
	}

	
	@RequestMapping("rambulance")
	public String showRAmbulance(HttpServletRequest req){
		
		List<ReceptionistBean> rbean=receptionistServiceImpl.loadRAmbulanceDetails();
		req.setAttribute("rambulancelist",rbean);
				return "ramubulance";
	}
	
	
	@RequestMapping(value="/rambulancedetails")
	public String addRAmbulance(HttpServletRequest req){
		
		ReceptionistBean rbean=buildRAmbulance(req);
		String anumber=rbean.getAmbulancenumber();
		if(req.getParameter("time").equals("out")){
		
		rbean=receptionistServiceImpl.saveRAmbulanceDetails(rbean);
		req.setAttribute("successmessage", "Ambulance outtime details added successfully");
		return "ramubulance";
		
		}
		else if(req.getParameter("time").equals("in")){
			anumber=receptionistServiceImpl.saveRAmbulanceOutDetails(anumber);
			req.setAttribute("successmessage", "Ambulance intime details added successfully");
			return "ramubulance";
		}
		return "ramubulance";
	}
	private ReceptionistBean buildRAmbulance(HttpServletRequest req){
		ReceptionistBean rbean=new ReceptionistBean();
		rbean.setAmbulancenumber(req.getParameter("anumber"));
		rbean.setDriver(req.getParameter("driver"));
		rbean.setIntime(req.getParameter("time"));
		
		return rbean;
	}
	
	@RequestMapping("/exportrambexcel")
	public ModelAndView getRAmbulanceExcel(HttpServletRequest req,Model model){
		List<ReceptionistBean> rlist=null;
		rlist=receptionistServiceImpl.loadRAmbulanceDetails();
		return new ModelAndView("RAmbulanceExcel", "rambulance",rlist);
	}

	@RequestMapping("/exportrambpdf")
	public ModelAndView getRAmbulancePdf(HttpServletRequest req,Model model){
		List<ReceptionistBean> rlist=null;
		rlist=receptionistServiceImpl.loadRAmbulanceDetails();
		return new ModelAndView("RAmbulancePdf", "rbean",rlist);
	}
	
	@RequestMapping("/addrappointment")
	public String showRAppointment(HttpServletRequest req)
	{

		List<DoctorBean> doctorbean=adminServiceImpl.loadDoctorDetails();
		req.setAttribute("doctorlist",doctorbean);
		
		
		List<DoctorBean> dbean=adminServiceImpl.loadPatientDetails();
		req.setAttribute("patientlist",dbean);
		return "rappointmentlist";	
	}
	@RequestMapping(value="/rprescriptiondetails",method=RequestMethod.POST)
	public String addRPatientAppintment(HttpServletRequest req) throws Exception
	{
		ReceptionistBean dbean=buildRPatientAppintment(req);
    
     List<DoctorBean> dlist=adminServiceImpl.loadPatientDetails();
     req.setAttribute("patientlist",dlist);
	
     dbean=receptionistServiceImpl.saveRPatientAppintmentDetails(dbean);
     req.setAttribute("successmessage", "patient details added successfully");
     return "rappointmentlist" ;
	}
	public ReceptionistBean buildRPatientAppintment(HttpServletRequest req) throws Exception
	{
		ReceptionistBean dbean =new ReceptionistBean();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		dbean.setAddedDate(format.parse(req.getParameter("apdate")));
		dbean.setAppTime(req.getParameter("aptime"));
		dbean.setPid(Integer.parseInt(req.getParameter("apname")));
		dbean.setCaseHistory(req.getParameter("achistory"));
		dbean.setMedication(req.getParameter("amdedication"));
		dbean.setNote(req.getParameter("anote"));
		return dbean;
		
	}
	@RequestMapping("/exportdrappointexcel")
	public ModelAndView getRPatientAppointDetailsExcel(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("RPatientAppExcel", "patient",dlist);
	}

	@RequestMapping("/exportrappointpdf")
	public ModelAndView getRPatientAppointDetailspdf(HttpServletRequest req,Model model){
		List<DoctorBean> dlist=null;
		dlist=adminServiceImpl.loadPatientDetails();
		return new ModelAndView("RPatientAppPd", "patient",dlist);
	}
	@RequestMapping("/addrambulanceexp")
	public String showRAmbulanceFuelExp(HttpServletRequest req)
	{  List<ReceptionistBean> fueldetails=receptionistServiceImpl.loadRAmbulanceFuelDetails();
	req.setAttribute("fuelexpen",fueldetails);
		
		return "rambulancefuel";	
	}
	@RequestMapping(value="/addfuelexpenses")
	public String addRAmbulanceFuel(HttpServletRequest req)throws ParseException{
		
		ReceptionistBean rbean=buildRAmbulanceFuel(req);
		rbean=receptionistServiceImpl.saveRAmbulanceFuelExpenses(rbean);	 
		req.setAttribute("successmessage", "fuel details added successfully");
		
		List<ReceptionistBean> fueldetails=receptionistServiceImpl.loadRAmbulanceFuelDetails();
		req.setAttribute("fuelexpen",fueldetails);
		return "rambulancefuel";
	}
	private ReceptionistBean buildRAmbulanceFuel(HttpServletRequest req) throws ParseException{
		ReceptionistBean rbean=new ReceptionistBean();
		rbean.setAmbulancenumber(req.getParameter("ambno"));
		rbean.setDriver(req.getParameter("ambname"));
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		rbean.setAddedDate(format.parse(req.getParameter("ambdate")));
		rbean.setAppTime(req.getParameter("ambtime"));
		rbean.setFuelquantity(Integer.parseInt(req.getParameter("ambquantity")));
		rbean.setFuelamount(Integer.parseInt(req.getParameter("ambamount")));
		
		return rbean;
	}
	
	
	@RequestMapping(value="/efuelexpenses",method=RequestMethod.POST)
	public String editRAmbulanceFuelExpensesDetails(HttpServletRequest req)throws ParseException
	{  
 		List<ReceptionistBean> fueldetails=receptionistServiceImpl.loadRAmbulanceFuelDetails();
		
 		
		req.setAttribute("fuelexpen",fueldetails);
		
		ReceptionistBean dbean=buildEditRAmbulanceFuelDetails(req);
		
		receptionistServiceImpl.editRAmbulanceFuelDetails(dbean);
		req.setAttribute("successmessage", "fuel details updated successfully");
		return "rambulancefuel";
	}
	
	public ReceptionistBean buildEditRAmbulanceFuelDetails(HttpServletRequest req)throws ParseException
	{
		ReceptionistBean dbean=new ReceptionistBean();
		dbean.setAmbulancenumber(req.getParameter("ambnumber"));
		dbean.setDriver(req.getParameter("ambdrvr"));
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		dbean.setAddedDate(format.parse(req.getParameter("ambfilldate")));
		dbean.setFuelquantity(Integer.parseInt(req.getParameter("ambfuel")));
		dbean.setFuelamount(Integer.parseInt(req.getParameter("fuelamnt")));		
		return dbean;
	}
	
	@RequestMapping("/exportrafexcel")
	public ModelAndView getRAmbulanceFuelExpExcel(HttpServletRequest req,Model model){
		List<ReceptionistBean> fueldetails=receptionistServiceImpl.loadRAmbulanceFuelDetails();
		return new ModelAndView("RAmbulanceFuelExcel", "fueldet",fueldetails);
	}

	@RequestMapping("/exportrafpdf")
	public ModelAndView getRAmbulanceFuelExpPdf(HttpServletRequest req,Model model){
		List<ReceptionistBean> fueldetails=receptionistServiceImpl.loadRAmbulanceFuelDetails();
		return new ModelAndView("RAmbulanceFuelPdf", "fueldet",fueldetails);
	}
	
	@RequestMapping("/deleteambfuelexp")
	public String deleteRAmbulanceFuelRecord(HttpServletRequest req)
	{
		String email=req.getParameter("demail");
List<ReceptionistBean> fueldetails=receptionistServiceImpl.loadRAmbulanceFuelDetails();
		
 		
		req.setAttribute("fuelexpen",fueldetails);
		receptionistServiceImpl.deleteRAmbulanceFuelRecordDetails(email);
		
		return "rambulancefuel";
		
	}
	
	@RequestMapping("/apple")
	public String showdctr(HttpServletRequest req){
		

				return "Dctrapp";
	}
	
	
	
	
}
