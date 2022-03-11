package com.ws.medical.patients;

import com.ws.medical.patients.Controller.Controller_Patient;
import com.ws.medical.patients.Model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootApplication
public class PatientsApplication {
	
	public static void main (String[] args) {
//		Controller_Patient.createPatient("Jean", "Ragueneau", "1222222222222");
//		Controller_Patient.createPatient("Pierre", "Villiers", "1222252222222");
//		Controller_Patient.createPatient("Sarujan", "Rajaratnam", "1222252222422");
		SpringApplication.run(PatientsApplication.class, args);
	}
}
