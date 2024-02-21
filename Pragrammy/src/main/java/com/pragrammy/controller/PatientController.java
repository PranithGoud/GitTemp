package com.pragrammy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragrammy.model.Patient;
import com.pragrammy.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	
	@PostMapping("/register")
	 public String register(@RequestBody Patient patient) {
		return patientService.register(patient);
	}
	
	@GetMapping("/list")
	public List<Patient> listOfPatients()
	{
		return patientService.listOfPatient();
	}
	
	@GetMapping("/view/{Id}")
	public Patient viewprofile(@RequestParam String Id)
	{
		return patientService.viewPatient(Id);
	}
	
	@DeleteMapping("/delete/{Id}")
	public void deletePatient(@RequestParam String Id)
	{
		patientService.delete(Id);
	}
}
