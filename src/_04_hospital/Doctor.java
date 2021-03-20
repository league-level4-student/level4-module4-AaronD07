package _04_hospital;

import java.util.ArrayList;
import java.util.List;

import javax.print.Doc;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		patients.add(patient);
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}



	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i=0; i<patients.size(); i++) {
patients.get(i).feelsCaredFor=true;
	}
	}
}
