package com.htc.doctorservice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6365454512188588857L;
	@Column
	private Long appointmentId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;
	@Column
	private String doctorName;
	@Column 
	private Date appointmentDate;
	public Doctor() {
		super();
	
	}
	public Doctor(Long appointmentId, String doctorName, Date appointmentDate) {
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
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointmentId == null) ? 0 : appointmentId.hashCode());
		result = prime * result + ((doctorId == null) ? 0 : doctorId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (appointmentId == null) {
			if (other.appointmentId != null)
				return false;
		} else if (!appointmentId.equals(other.appointmentId))
			return false;
		if (doctorId == null) {
			if (other.doctorId != null)
				return false;
		} else if (!doctorId.equals(other.doctorId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctor [appointmentId=" + appointmentId + ", doctorId=" + doctorId + ", doctorName=" + doctorName
				+ ", appointmentDate=" + appointmentDate + "]";
	}
	
}
	
	