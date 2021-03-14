package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Doctor> doctors = new ArrayList<Doctor>();
List<Patient> patients = new ArrayList<Patient>();
	public void addDoctor(GeneralPractitioner generalPractitioner) {
		doctors.add(generalPractitioner);
		// TODO Auto-generated method stub
			}
	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		doctors.add(surgeon);
	}
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

}
