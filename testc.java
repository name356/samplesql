package test;

import java.sql.*;

public class testc {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		insertQuery();
		selectQuery();
	}
	static void insertQuery() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","@Toor#");
		System.out.println("Connection object created");
		Statement s = con.createStatement();
		System.out.println("Statement object created");
		int n  = s.executeUpdate("INSERT INTO DETAILS(ename,branch,amount) VALUES ('Harish','kurukusanthu',40000)");
		System.out.println("Value Inserted");
	}
	static void selectQuery() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","@Toor#");
		System.out.println("Connection object created");
		Statement s = con.createStatement();
		System.out.println("Statement object created");
		ResultSet rs = s.executeQuery("Select * From details where ename = 'Harish';");
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
	}
}
