package com.hm.datab.facade;

import java.util.List;

import com.hm.datab.beans.Receptionist;

public interface ReceptionistFunctions {

	public Receptionist saveRAmbulanceDetails(Receptionist recep);
	public String saveRAmbulanceOutDetails(String anumber);
	public List<Receptionist> loadRAmbulanceDetails();
	public Receptionist saveRPatientAppointmentDetails(Receptionist recep);
    public Receptionist saveRAmbulanceFuelExpensesDetails(Receptionist recep);
    public List<Receptionist> loadRAmbulanceFuelDetails();
    public Receptionist updateRAmbulanceFuelRecordDetails(Receptionist recep);
    public String deleteRAmbulanceFuelRecord(String ambno);
}
