package com.oops.inheritance;

public class Employee {
	int empId;
	String empName;

	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public Employee() {

	}

	public void displayEmpDetails() {
		System.out.println("Emp Id : " + empId);
		System.out.println("Emp Name : "+empName);
	}

	public void calSalary() {
		System.out.println("Salary Method from Employee!");
	}
}
