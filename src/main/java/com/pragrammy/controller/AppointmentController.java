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

import com.pragrammy.model.Appointment;
import com.pragrammy.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	AppointmentService appoService;
	
	@PostMapping("/register")
	 public String register(@RequestBody Appointment patient) {
		return appoService.register(patient);
	}
	
	@GetMapping("/list")
	public List<Appointment> listOfAppointments()
	{
		return appoService.listOfAppointments();
	}
	
	@GetMapping("/view/{Id}")
	public Appointment viewAppointment(@RequestParam String Id)
	{
		return appoService.viewAppointment(Id);
	}
	
	/*
	 * @GetMapping("/list/{patientId}") public List<Appointment>
	 * listOfAppointmentsByPid(@RequestParam String patientId) { return
	 * appoService.listOfAppointmentsByPid(patientId); }
	 */
	
	@DeleteMapping("/delete/{Id}")
	public void deletePatient(@RequestParam String Id)
	{
		appoService.delete(Id);
	}
}
