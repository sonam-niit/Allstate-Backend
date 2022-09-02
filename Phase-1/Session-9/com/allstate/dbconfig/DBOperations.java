package com.allstate.dbconfig;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {

	public static void main(String[] args) {
		
		Connection conn= DBConfig.getConnect();
		
		try {
			Statement stmt= conn.createStatement();
			stmt.executeUpdate("Create database sample");
			
			System.out.println("Database created");
			
			stmt.executeUpdate("use sample");
			
			System.out.println("Database selected to use");
			
			stmt.executeUpdate("Drop database sample");
			System.out.println("Database dropped");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
