package com.oops.inheritance;

public class ContractEmployee extends Employee {
	public ContractEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	public void calSalary() {
		System.out.println("No.of Hours Worked : " + 5);
		System.out.println("Amount  Per Hour : " + 150 + "/-");
		System.out.println("Wages Per Day : " + (5 * 150) + "/-");
	}
}
