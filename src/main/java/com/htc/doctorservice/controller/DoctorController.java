package com.htc.doctorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.doctorservice.DTO.DoctorDTO;
import com.htc.doctorservice.entity.Doctor;
import com.htc.doctorservice.persistence.IDoctor;



@RestController
@RequestMapping("/api")
public class DoctorController {
	
	private IDoctor repo;
 
@GetMapping("/doctors/{doctorId}")
Doctor getDoctor(@PathVariable Long doctorId)
{
	Doctor doc=null;
	doc=repo.findById(doctorId).get();
	return doc;
	
}

@GetMapping("/doctors/{appointmentId}")
Doctor getDoctorByAppoinmentId(@PathVariable Long appointmentId)
{
	Doctor doc=null;
	doc=repo.findByAppointmentId(appointmentId);
	return doc;
	
}
@PostMapping("/doctors")
Doctor createEmployee(@RequestBody DoctorDTO doc)

{
	Doctor doctor=new Doctor(doc.getAppointmentId(),doc.getDoctorName(),doc.getAppointmentDate() );
	return repo.save(doctor);
	
}


@Autowired
public void setRepo(IDoctor repo) {
	this.repo = repo;
}
	
	
}