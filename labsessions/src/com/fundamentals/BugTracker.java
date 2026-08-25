package com.fundamentals;

public class BugTracker {

	String bugID;
	String applicationName;
	String bugTitle;
	String severity;
	int bugPrioroity;
	String bugStatus;
	String assignedDeveloper;

	public BugTracker(String bID, String appName, String bTilte, String bSeverity, int bPriority, String bStatus,
			String bassignedDev) {
		bugID = bID;
		applicationName = appName;
		bugTitle = bTilte;
		severity = bSeverity;
		bugPrioroity = bPriority;
		bugStatus = bStatus;
		assignedDeveloper = bassignedDev;
	}

	public String getBugID() {
		return bugID;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public String getBugTitle() {
		return bugTitle;
	}

	public String getSeverity() {
		return severity;
	}

	public int getBugPrioroity() {
		return bugPrioroity;
	}

	public String getBugStatus() {
		return bugStatus;
	}

	public String getAssignedDeveloper() {
		return assignedDeveloper;
	}

	public void updateStatus(String newStatus) {
		bugStatus = newStatus;
	}
	
	public void assignToDeveloper(String bugID, String devName) {
		assignedDeveloper = devName;
		updateStatus("In Development");
	}

	public void bugSummary() {
		System.out.println("========================================================");
		System.out.println("Bug ID -> " + getBugID());
		System.out.println("Bug Title -> " + getBugTitle());
		System.out.println("Application Name -> " + getApplicationName());
		System.out.println("Bug Severity -> " + getSeverity());
		System.out.println("Bug Priority -> " + getBugPrioroity());
		System.out.println("Bug Status -> " + getBugStatus());
		System.out.println("Assigned Developer For This Bug -> " + getAssignedDeveloper());
		System.out.println("========================================================");
	}

	public static void main(String[] args) {
		BugTracker b1 = new BugTracker("Bug12", "Login Application", "Bypassing the credentials validations", "Highly Vulnerable", 3, "Open", "Manohar");
		b1.bugSummary();
		b1.assignToDeveloper(b1.getBugID(),"Sai");
		b1.bugSummary();
	}
}
