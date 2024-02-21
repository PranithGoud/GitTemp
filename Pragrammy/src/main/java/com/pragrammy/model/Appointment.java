package com.pragrammy.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity	
public class Appointment {
	
	@Id
	 private String booking_id;
	    private String disease;

	    private Date tentativeDate;
	    private String priority;

	    private String patientId;
	    private Date bookingTime;

	    public Appointment( String disease, Date tentativeDate, String priority, String patientId) {
	        super();

	        this.disease = disease;
	        this.tentativeDate = tentativeDate;
	        this.priority = priority;
	        this.patientId = patientId;

	    }

}
