package com.htc.doctorservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.doctorservice.DTO.DoctorDTO;
import com.htc.doctorservice.entity.Doctor;
import com.htc.doctorservice.persistence.IDoctor;



@RestController
@RequestMapping("/api")
public class DoctorController {
	@Autowired
	private IDoctor repo;
 
@GetMapping("/doctor/{doctorId}")
Doctor getDoctor(@PathVariable Long doctorId)
{
	Doctor doc=null;
	doc=repo.findByDoctorId(doctorId);
	return doc;
	
}

@GetMapping("/doctor-appointmentId/{appointmnetId}")
Doctor getDoctorByAppointmentId(@PathVariable Long appointmnetId)
{
	Doctor doc=null;
	doc=repo.findByAppointmentId(appointmnetId);
	return doc;
	
}

//@GetMapping("/doctors")
//public List<Doctor> getAllDoctors() {
// 
//  List<Doctor> list = new ArrayList<>();
//  Iterable<Doctor> customers = repo.findAll();
//
//  customers.forEach(list::add);
//  return list;
//	
//	
//}

@PostMapping("/doctors")
Doctor createEmployee(@RequestBody DoctorDTO doc)

{
	Doctor doctor=new Doctor(doc.getDoctorName(),doc.getSpecialization(),doc.getContactNo(),doc.getAppointmentId() );
	return repo.save(doctor);
	
}
@PutMapping("/doctor")
private Doctor update(@RequestBody Doctor doctor)   
{  
doctor=repo.saveAndFlush(doctor);  
return doctor;  
}  

@DeleteMapping("/doctors/{doctorId}")
void deletePatient(@PathVariable Long doctorId)
{
	 repo.deleteById(doctorId);
	
}


@Autowired
public void setRepo(IDoctor repo) {
	this.repo = repo;
}
	
	
}