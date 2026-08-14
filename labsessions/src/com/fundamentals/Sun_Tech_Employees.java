package com.fundamentals;

public class Sun_Tech_Employees {

	static String companyName = "SunTech Solutions";
	static String comapnyLocation = "HI-TECH city";

	int empID;
	String empName;
	String desgination;
	String departmentName;
	double empSalary;
	String remoteLoc = comapnyLocation;

	static {
		System.out.println(" | Welcome to SunTech Solutions | Employees HRMS Portal |");
	}

//	No return type + with Parameters
	public void empDetails(int id, String name, String desg, String deptName, double salary) {

		empID = id;
		empName = name;
		desgination = desg;
		departmentName = deptName;
		empSalary = salary;

	}

//  no return type + no parameters
	public void displayEmpDetails() {
		System.out.println("========= Employee Details =========");
		System.out.println(" Employee ID : " + empID);
		System.out.println(" Employee Name : " + empName);
		System.out.println(" Department : " + departmentName);
		System.out.println(" Employee Desgination : " + desgination);
		System.out.println(" Employee Monthly  Salary : " + empSalary + "/-");
		System.out.println(" Employee Remote Location : " + remoteLoc);
		System.out.println("====================================");
	}

	void promoteEmployee(String newDesgination) {
		desgination = newDesgination;
		System.out.println(" Your Desgination Changed to : " + desgination);
		System.out.println("====================================");
	}

	void updateSalary() {
		empSalary += 5000;
		System.out.println(" Your Salary Changed to : " + empSalary + "/-");
		System.out.println("====================================");
	}

	void updateRemoteLoc(String newLocation) {
		remoteLoc = newLocation;
		System.out.println(" Your New Location is : " + remoteLoc);
		System.out.println("====================================");
	}

	public static void main(String[] args) {
		Sun_Tech_Employees emp1 = new Sun_Tech_Employees();

//		Method calling with arguments --> pass by value.
		emp1.empDetails(101, "Mr. Manohar", "Senior Developer", "Developement Dept", 50000);
//		Method Calling without any arguments
		emp1.displayEmpDetails();
		emp1.promoteEmployee("HR");
		emp1.updateSalary();
		emp1.updateRemoteLoc("Financial Dist");
	}

}
