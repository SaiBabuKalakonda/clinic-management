package com.htc.doctorservice.DTO;

import java.util.Date;

public class DoctorDTO {
	
	private Long appointmentId;
	
	private String doctorName;
	 
	private Date appointmentDate;

	public DoctorDTO(Long appointmentId, String doctorName, Date appointmentDate) {
		super();
		this.appointmentId = appointmentId;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "DoctorDAO [appointmentId=" + appointmentId + ", doctorName=" + doctorName + ", appointmentDate="
				+ appointmentDate + "]";
	}
	
}