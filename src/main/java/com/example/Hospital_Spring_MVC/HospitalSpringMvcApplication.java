package com.example.Hospital_Spring_MVC;

import com.example.Hospital_Spring_MVC.entities.Patient;
import com.example.Hospital_Spring_MVC.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalSpringMvcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
			patientRepository.save(new Patient(null , "mohammed", new Date() , false , 12));
			patientRepository.save(new Patient(null , "hicham", new Date() , false , 10));
			patientRepository.save(new Patient(null , "nadia", new Date() , false , 20));
			patientRepository.save(new Patient(null , "bayane", new Date() , false , 25));


			patientRepository.findAll().forEach(patient -> {
				System.out.println(patient.getNom());
			});
		};
	}


}
