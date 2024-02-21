package com.pragrammy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragrammy.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, String> {

	//List<Appointment> findbyPatientId(String patientId);

}
