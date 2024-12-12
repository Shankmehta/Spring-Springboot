package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDataJpaProj1CrudRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootDataJpaProj1CrudRepositoryApplication.class, args);
		
		
	 IDoctorService service =ctx.getBean("doctorService",IDoctorService.class) ;
	 
	 try
	 {
		Doctor doctor= new Doctor();
		doctor.setDocName("raja");
		doctor.setSpecialization("MD-Cardio");
		doctor.setIncome(890000.0);
		
		String resultMsg=service.registerDoctor(doctor);
		System.out.println(resultMsg);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 ((ConfigurableApplicationContext) ctx).close();
	}

}
