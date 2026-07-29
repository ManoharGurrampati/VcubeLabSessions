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
	
	public void setDetails() {
		System.out.println("Enter Student Details");
		System.out.println("Enter ID");
		stdID = s.nextInt();
		System.out.println("Enter Name");
		stdName = s.next();
		System.out.println("Enter degree");
		degree = s.next();
		System.out.println("Enter phone number");
		stdPhoneNum = s.nextLong();
		System.out.println("Enter Address");
		stdAddress = s.next();
	}
	
	void displayDetails() {
		System.out.println("===================================");
		System.out.println("Student Details");
		System.out.println("College Name : "+collegeName);
		System.out.println("Std ID : "+stdID);
		System.out.println("Std Name"+stdName);
		System.out.println("Std Degree"+degree);
		System.out.println("Std Phone Number : "+stdPhoneNum);
		System.out.println("Std Address : "+stdAddress);
		System.out.println("===================================");
	}
	
	public static void main(String[] args) {
		Student1 obj = new Student1();
		obj.setDetails();
		obj.displayDetails();
	}

}
