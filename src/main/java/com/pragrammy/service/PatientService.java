package com.pragrammy.service;


import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragrammy.model.Patient;
import com.pragrammy.repository.PatientRepo;



@Service
public class PatientService {

	@Autowired
	PatientRepo patientrepo;
	
	@SuppressWarnings("unchecked")
	public String register(Patient patient) {
		

		JSONObject json = new JSONObject();
		try
		{
			patientrepo.save(patient);
			json.put("message", "Registration Successful");
		}
		catch(Exception e)
		{
			json.put("message", "Registration Failed");
		}
		
		return json.toJSONString();
	}

	public List<Patient> listOfPatient() {
		
		return patientrepo.findAll();
	}

	public Patient viewPatient(String id) {
		return patientrepo.findById(id).get();
	}

	public void delete(String id) {
		patientrepo.deleteById(id);
		
	}

}
