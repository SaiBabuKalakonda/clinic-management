package com.htc.doctorservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.doctorservice.entity.Doctor;



@Repository
public interface IDoctor extends JpaRepository<Doctor,Long>{
	
}
