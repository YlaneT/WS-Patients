package com.ws.medical.patients.Dao;

import com.ws.medical.patients.Model.Patient;

import java.util.ArrayList;

public interface I_PatientDao /*extends JpaRepository<Patient, Integer>*/ {
	
	Patient getPatientFromData (int id);
	
	ArrayList<Patient> getPatientsFromData ();
	
	boolean save (Patient patient);
}
