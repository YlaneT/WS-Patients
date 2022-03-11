package com.ws.medical.patients.Model;

import com.ws.medical.patients.Consultation;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Patient {
	private static ArrayList<Patient> patientsList = new ArrayList<>();
	
	private int                     id;
	private ArrayList<Disease>      diseases;
	private ArrayList<Consultation> consults;
	private String                  lastName;
	private String                  firstName;
	private String                  numSecSoc;
	private Medecin                 medecinTraitant;
	
	public Patient () {
	
	}
	
	public Patient (String first_name, String last_name, String num_sec_soc) {
		if (patientsList.size() == 0) {
			this.id = 0;
		}
		else {
			this.id = patientsList.get(patientsList.size() - 1).getId() + 1;
		}
		this.firstName = first_name.strip();
		this.lastName = last_name.strip();
		this.numSecSoc = num_sec_soc.strip();
		this.consults = new ArrayList<Consultation>();
		patientsList.add(this);
	}
	
	public static ArrayList<Patient> getPatientsList () {
		return patientsList;
	}
}
