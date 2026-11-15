package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/DBNAME";
	private static final String username = "username";
	private static final String password = "YourPassword";
	private static final String driverClassURL = "com.mysql.cj.jdbc.Driver";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driverClassURL);
			con = DriverManager.getConnection(URL, username, password);
		} catch (Exception e) {
			System.out.println("Something Went Wrong While Connecting To DB!!!");
		}
		return con;
	}

}
