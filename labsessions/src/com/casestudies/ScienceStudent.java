package com.casestudies;

public class ScienceStudent extends Student {

	public ScienceStudent(int id, String name, String className) {
		super(id, name, className);
	}

	public void displayResults(int sub1, int sub2, int sub3) {
		double total = sub1 + sub2 + sub3;
		double percentage = (total / 300) * 100;
		System.out.println("========>  Science Student Details <========");
		System.out.println("Student Id : " + stdID);
		System.out.println("Student Name : " + stdName);
		System.out.println("Class Name : " + className);
		System.out.println("Marks in physics :" + sub1);
		System.out.println("Marks in chemistry :" + sub2);
		System.out.println("Marks in maths :" + sub3);
		System.out.println("Total Marks in 3 Subjects : " + total);
		System.out.println("Percentage : " + percentage + "%");
		if (total <= 300 && total >= 200) {
			System.out.println(stdName + " -> Passed!!!");
		} else {
			System.out.println(stdName + " -> Failed!!");
		}
		System.out.println("============================================");
	}
}
