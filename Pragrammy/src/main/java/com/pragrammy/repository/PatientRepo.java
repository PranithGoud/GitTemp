package com.pragrammy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragrammy.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, String> {

}
