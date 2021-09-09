package com.htc.doctorservice.DTO;

import java.util.Date;

public class DoctorDTO {
	
	
	
	private String doctorName;
	 
	private String Specialization;
	
	private Long contactNo;

	public DoctorDTO(String doctorName, String specialization, Long contactNo) {
		super();
		this.doctorName = doctorName;
		Specialization = specialization;
		this.contactNo = contactNo;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "DoctorDTO [doctorName=" + doctorName + ", Specialization=" + Specialization + ", contactNo=" + contactNo
				+ "]";
	}

}