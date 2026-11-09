package com.casestudies;

public class ExaminationSystem {
	public static void main(String[] args) {
		ScienceStudent std1 = new ScienceStudent(207, "Manohar Reddy G", "XII-B");
		std1.displayResults(95, 98, 97);
		ArtsStudent std2 = new ArtsStudent(45, "Koti Reddy P", "XII-A");
		std2.displayResults(80, 70, 50);
	}
}
