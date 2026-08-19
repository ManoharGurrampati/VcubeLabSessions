package com.fundamentals;

public class Hospital_PatientDetails {

	static String hospitalName = "Mayuri Ayurvedic Hospital";

	static {
		System.out.println("===================================================");
		System.out.println("| Welcome to " + hospitalName + " |");
	}

	String patientName;
	int pID;
	int pAge;
	String pGender;
	String disease_Description;
	String pCity;

	String getPatientName(String name) {
		return name;
	}

	int getPatientID(int id) {
		return id;
	}

	int getPatientAge(int age) {
		return age;
	}

	String getPatientGender(String gender) {
		return gender;
	}

	String getDisease_Description(String msg) {
		return msg;
	}

	String patientCity(String city) {
		return city;
	}

	public void displayPatientDetails() {
		System.out.println("===================================================");
		System.out.println("Name of the patient -> " + patientName+" | Patient ID -> " + pID);
		System.out.println("Patient Age -> " + pAge);
		System.out.println("Patient Gender -> " + pGender);
		System.out.println("Disease Description -> " + disease_Description);
		System.out.println("City -> " + pCity);
		System.out.println("===================================================");
	}

	public static void main(String[] args) {

		Hospital_PatientDetails p1 = new Hospital_PatientDetails();
		p1.patientName = p1.getPatientName("V.Sai");
		p1.pID= p1.getPatientID(1);
		p1.pAge = p1.getPatientAge(25);
		p1.pGender = p1.getPatientGender("Male");
		p1.disease_Description = p1.getDisease_Description("Suffering with AIDS from childhood !");
		p1.pCity = p1.patientCity("Hyderabad");
		p1.displayPatientDetails();
		
		
	}

}
