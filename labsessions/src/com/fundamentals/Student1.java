package com.fundamentals;

import java.util.Scanner;

public class Student1 {

	Scanner s = new Scanner(System.in);
	
	private final static String collegeName ="Sphoorthy Engg College";
	
	int stdID;
	String stdName;
	String degree;
	long stdPhoneNum;
	String stdAddress;
	
	
	public void setStdID() {
		System.out.println("Enter  Studnet Id");
		stdID = s.nextInt();
		s.nextLine();
	}

	public void setStdName() {
		System.out.println("Enter Student Name");
		stdName = s.nextLine();
	}

	public void setDegree() {
		System.out.println("Enter Student Degree");
		degree = s.next();
	}

	public void setStdPhoneNum() {
		System.out.println("Enter Student Phone Number");
		stdPhoneNum = s.nextLong();
		s.nextLine();
	}

	public void setStdAddress() {
		System.out.println("Enter Student Address");
		stdAddress = s.nextLine();
	}

	void displayDetails() {
		System.out.println("===================================");
		System.out.println("Student Details");
		System.out.println("College Name : "+collegeName);
		System.out.println("Std ID : "+stdID);
		System.out.println("Std Name :"+stdName);
		System.out.println("Std Degree :"+degree);
		System.out.println("Std Phone Number :"+stdPhoneNum);
		System.out.println("Std Address :"+stdAddress);
		System.out.println("===================================");
	}
	
	public static void main(String[] args) {
		Student1 obj = new Student1();
		obj.setStdID();
		obj.setStdName();
		obj.setDegree();
		obj.setStdPhoneNum();
		obj.setStdAddress();
		obj.displayDetails();
	}

}
