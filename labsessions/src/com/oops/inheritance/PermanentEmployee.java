package com.oops.inheritance;

public class PermanentEmployee extends Employee {
	public PermanentEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	public void calSalary() {
		System.out.println("Fixed Monthly Salary : " + 45000.00 + "/-");
		System.out.println("House Rent : " + 90000 + "/-");
	}
}
