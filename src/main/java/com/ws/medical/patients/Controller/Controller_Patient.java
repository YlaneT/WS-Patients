package com.ws.medical.patients.Controller;

import com.ws.medical.patients.Consultation;
import com.ws.medical.patients.Model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller_Patient {
	
	static {
		createPatient("Jean", "Ragueneau", "1222222222222");
		createPatient("Sarujan", "Rajaratnam", "1222252222422");
		createPatient("Pierre", "Villiers", "1222252222222");
	}
	
	/* CREATE */
	public static void createPatient (String first_name, String last_name, String num_sec_soc) {
		new Patient(first_name, last_name, num_sec_soc);
	}
	
	/* READ */
	public static void showPatient (Patient patient) {
		System.out.println(patient);
	}
	
	@GetMapping("/patients")
	public static ArrayList<Patient> getAllPatients () {
		return Patient.getPatientsList();
	}
	
	@GetMapping("/patient/{id}")
	public static Patient getPatientsById (@PathVariable int id) {
		for(Patient patient : Patient.getPatientsList()) {
			if (id == patient.getId()) {
				return patient;
			}
		}
		return null;
	}
	
	/* UPDATE */
	public static void addConsult (Patient patient, Consultation... consults) {
		for(Consultation cst : consults) {
			patient.getConsults().add(cst);
		}
	}
	
	public static void addDisease (Patient patient, Disease disease) {
		patient.getDiseases().add(disease);
	}
	
	public static void setMedecinTraitant (Patient patient, Medecin medecin) {
		patient.setMedecinTraitant(medecin);
	}
	
	/* DELETE */
	public static void deleteConsult (Patient patient, Consultation... consultations) {
		for(Consultation cons : consultations) {
			patient.getConsults().remove(cons);
		}
	}
	
	public static void deleteDiseases (Patient patient, Disease... disease) {
		for(Disease dis : disease) {
			patient.getDiseases().remove(dis);
		}
	}
}
