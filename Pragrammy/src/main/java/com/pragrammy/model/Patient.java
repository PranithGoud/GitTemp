package com.pragrammy.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Patient {

	@Id
    private String patient_Id;
    private String patient_name;
    private String patient_email;
    private String patient_mobile;
    private Date registeredDate;


    public Patient(String patient_name, String patient_email, String patient_mobile, Date registeredDate) {
        this.patient_name = patient_name;
        this.patient_email = patient_email;
        this.patient_mobile = patient_mobile;
        this.registeredDate = registeredDate;
    }

    public Patient() {
        super();
    }
}
