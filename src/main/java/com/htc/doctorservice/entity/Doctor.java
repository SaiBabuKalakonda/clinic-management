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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;
	@Column
	private String doctorName;
	@Column 
	private String specialization;
	@Column 
	private Long contactNo;
	public Doctor() {
		super();
	
	}
	
	public Doctor(String doctorName, String specialization, Long contactNo) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.contactNo = contactNo;
	}

	public Long getContactNo() {
		return contactNo;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Long getDoctorId() {
		return doctorId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (doctorId == null) {
			if (other.doctorId != null)
				return false;
		} else if (!doctorId.equals(other.doctorId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", contactNo=" + contactNo + "]";
	}
	
}