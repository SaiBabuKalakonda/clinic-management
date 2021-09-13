package com.htc.doctorservice.DTO;

import java.util.Date;

public class DoctorDTO {
	
	
	
	private String doctorName;
	 
	private String specialization;
	
	private Long contactNo;
	
	private Long appointmentId;

	public DoctorDTO(String doctorName, String specialization, Long contactNo,Long appointmentId) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.contactNo = contactNo;
		this.appointmentId=appointmentId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	@Override
	public String toString() {
		return "DoctorDTO [doctorName=" + doctorName + ", specialization=" + specialization + ", contactNo=" + contactNo
				+ ", appointmentId=" + appointmentId + "]";
	}

	

}