package com.htc.doctorservice.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.doctorservice.entity.Doctor;



@Repository
public interface IDoctor extends JpaRepository<Doctor,Long>{
	public Doctor findByDoctorId(Long doctorId);
	public Doctor findByAppointmentId(Long appointmentId);

//	public List<Doctor> getAllDoctors();
	
}
