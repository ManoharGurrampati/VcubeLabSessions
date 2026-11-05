package com.oops.inheritance;

public class HelperClass {

	public static void main(String[] args) {
		System.out.println("============================================");
		PermanentEmployee p = new PermanentEmployee("Manohar G", 207);
		p.displayEmpDetails();
		p.calSalary();
		System.out.println("============================================");
		ContractEmployee c = new ContractEmployee("Koti Reddy", 45);
		c.displayEmpDetails();
		c.calSalary();
		System.out.println("============================================");
	}

}
