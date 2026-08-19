package com.fundamentals;

//This file contains 
public class College_StudentDetails {

	static String cllgName ="Sphoorthy Engg College";
	
	static {
		System.out.println("=======================================================");
		System.out.println("    | "+cllgName+" Student Portal | ");
		System.out.println("=======================================================");
	}
	
	String stdName;
	int stdId;

	int totalMarks;
	double avgerageMarks;

	public String getStudentName(String name) {
		return name;
	}

	public int getStdID(int id) {
		return id;
	}

	public void getFirstSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | First Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");
		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getSecondSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Second Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");

		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getThirdSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Third Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");

		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getFourthSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Fourth Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");

		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getFifthSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Fifth Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");

		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getsixthSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Sixth Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");
		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getSeventhSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Seventh Semeter Details |");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");
		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getEightSemDetails(int sub1, int sub2, int sub3, int sub4, int sub5) {
		System.out.println("================================");
		System.out.println(" | Eighth Semeter Details |");
		System.out.println("================================");
		System.out.println("Subject 1 Marks -> " + sub1);
		System.out.println("Subject 2 Marks -> " + sub2);
		System.out.println("Subject 3 Marks -> " + sub3);
		System.out.println("Subject 4 Marks -> " + sub4);
		System.out.println("Subject 5 Marks -> " + sub5);
		System.out.println("================================");
		getTotalMarks(sub1, sub2, sub3, sub4, sub5);
	}

	public void getTotalMarks(int sub1, int sub2, int sub3, int sub4, int sub5) {
		totalMarks = (sub1 + sub2 + sub3 + sub4 + sub5);
		System.out.println("Total Marks -> " + totalMarks+"/300");
		getaverage();
	}

	public void getaverage() {
		avgerageMarks = totalMarks / 5;
		System.out.println("Avg marks of semeter -> " + avgerageMarks);
		System.out.println("================================");
	}

	public static void main(String[] args) {

		College_StudentDetails student1 = new College_StudentDetails();

		student1.stdName = student1.getStudentName("G Manohar");
		student1.stdId = student1.getStdID(207);
		System.out.println("=======================================================");
		System.out.println("Student Name -> " + student1.stdName + " | Roll number -> " + student1.stdId);
		System.out.println("=======================================================");

		student1.getFirstSemDetails(30, 45, 54, 29, 39);
		student1.getSecondSemDetails(40, 45, 34, 30, 50);
		student1.getThirdSemDetails(26, 45, 44, 49, 39);
		student1.getFourthSemDetails(39, 45, 54, 29, 39);
		student1.getFifthSemDetails(45, 45, 34, 29, 39);
		student1.getsixthSemDetails(38, 45, 34, 36, 39);
		student1.getSeventhSemDetails(55, 47, 54, 29, 34);
		student1.getEightSemDetails(30, 44, 24, 50, 45);
		
		College_StudentDetails student2 = new College_StudentDetails();

		student2.stdName = student1.getStudentName("V sai");
		student2.stdId = student1.getStdID(520);
		System.out.println("=======================================================");
		System.out.println("Student Name -> " + student2.stdName + " | Roll number -> " + student2.stdId);
		System.out.println("=======================================================");

		student2.getFirstSemDetails(30, 45, 54, 29, 39);
		student2.getSecondSemDetails(40, 45, 34, 30, 50);
		student2.getThirdSemDetails(26, 45, 44, 49, 39);
		student2.getFourthSemDetails(39, 45, 54, 29, 39);
		student2.getFifthSemDetails(45, 45, 34, 29, 39);
		student2.getsixthSemDetails(38, 45, 34, 36, 39);
		student2.getSeventhSemDetails(55, 47, 54, 29, 34);
		student2.getEightSemDetails(30, 44, 24, 50, 45);

	}

}
