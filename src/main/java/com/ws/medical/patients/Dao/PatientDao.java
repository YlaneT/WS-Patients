package com.ws.medical.patients.Dao;

import com.ws.medical.patients.Model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PatientDao implements I_PatientDao {
	@Override
	public Patient getPatientFromData (int id) {
		return null;
	}
	
	@Override
	public ArrayList<Patient> getPatientsFromData () {
		return null;
	}
	
	@Override
	public boolean save (Patient patient) {
		return false;
	}
}
