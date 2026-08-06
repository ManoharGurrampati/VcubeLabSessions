package com.fundamentals;

public class EmployeeSalaryDetails {
	static String companyName ="Ring Central";

	String empName="G Manohar Reddy";
	double monthlySalary =  15000;
	double monthlyGST;
	double monthlyPF;
	double netMonthlySalary;
	
	double annualGST;
	double annualPF;
	double annualNetSalary;
	
	public void calculateMonthlyPf() {
		monthlyPF = (0.02 * monthlySalary);
	}
	
	public void calculateMonthlyGST() {
		monthlyGST = (0.03 * monthlySalary);
	}
	
	public void calculateNetMonthlySalary() {
		netMonthlySalary =(monthlySalary-monthlyGST-monthlyPF);
	}
	
	public void calculateAnnualGST() {
		annualGST = (monthlyGST*12);
	}
	
	public void calculateAnnualPF() {
		annualPF = (monthlyPF*12);
	}
	
	public void calculateAnnualNetSalary() {
		annualNetSalary = (netMonthlySalary*12);
	}
	
	private void helperMethod() {
		calculateMonthlyGST();
		calculateMonthlyPf();
		calculateNetMonthlySalary();
		calculateAnnualGST();
		calculateAnnualPF();
		calculateAnnualNetSalary();
	}
	
	public void displayEmployeeDetails() {
		System.out.println("============================================= \n");
		System.out.println(" Name of the Company : "+companyName);
		System.out.println(" Name of Employee : "+empName+"\n");
		System.out.println(" ===> Monthly Salary Details <=== \n");
		System.out.println(" Monthly Salary : "+monthlySalary);
		System.out.println(" Monthly GST : "+monthlyGST);
		System.out.println(" Monthly PF : "+monthlyPF);
		System.out.println(" Net Monthly Salary : "+netMonthlySalary+"\n");
		System.out.println(" ===> Annual Salary Details <=== \n");
		System.out.println(" Annual  GST : "+annualGST);
		System.out.println(" Net PF : "+annualPF);
		System.out.println(" Annual Salary : "+annualNetSalary+"\n");
		System.out.println("=============================================");
	}
	public static void main(String[] args) {
		
		EmployeeSalaryDetails emp = new EmployeeSalaryDetails();
		emp.helperMethod();
		emp.displayEmployeeDetails();
	}
}
