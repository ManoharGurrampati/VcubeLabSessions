package com.fundamentals;

public class RestrautantTable {

	int tableID;

	int tableCapacity;
	boolean tableReserved = false;

	static String restrauntName = "Dawaath ";
	static int totalTables = 10;

	protected void reserveTable() {
		tableReserved = true;
		totalTables -= 1;
	}

	protected void cancelReservation() {
		tableReserved = false;
		System.out.println("Table number " + tableID + " is not reserved, You can reserve now ! ");
		totalTables += 1;
		System.out.println("Total Number of tables :" + totalTables);
	}

	protected void displayTableDeatils() {
		System.out.println("=======> Welcome to " + restrauntName + " Restrautant <=======");
		System.out.println("Your table id is :" + tableID);
		System.out.println("Your table capacity is :" + tableCapacity);
		if (tableReserved == true) {
			System.out.println("Table Number " + tableID + " is Booked");
		}
		System.out.println("Total number of tables available : (After Reservation) " + totalTables);
		System.out.println("=====================================================");
	}

	protected static void changeRestrautantName() {
		System.out.println("=====================================================");
		restrauntName = "Mefhil Restaruant";
		System.out.println("Restaruant Name is Changed :" + restrauntName);
	}

	public static void main(String[] args) {
		RestrautantTable table1 = new RestrautantTable();
		table1.tableID = 5;
		table1.tableCapacity = 3;
		table1.reserveTable();
		table1.displayTableDeatils();
		table1.cancelReservation();
		changeRestrautantName();

	}

}
