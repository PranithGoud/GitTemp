package com.pragrammy.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragrammy.model.Appointment;
import com.pragrammy.repository.AppointmentRepo;


@Service
public class AppointmentService {

	@Autowired
	AppointmentRepo appoRepo;
	
	@SuppressWarnings("unchecked")
	public String register(Appointment patient) {
		JSONObject json = new JSONObject();
		try
		{
			appoRepo.save(patient);
			json.put("message", "Booking Successful");
		}
		catch(Exception e)
		{
			json.put("message", "Booking Failed");
		}
		
		return json.toJSONString();
	}

	

	public List<Appointment> listOfAppointments() {
		
		return appoRepo.findAll();
	}

	public Appointment viewAppointment(String id) {
		return appoRepo.findById(id).get();
	}

	public void delete(String id) {
		appoRepo.deleteById(id);
		
	}



	/*
	 * public List<Appointment> listOfAppointmentsByPid(String patientId) { return
	 * appoRepo.findbyPatientId(patientId);
	 * 
	 * }
	 */
}
