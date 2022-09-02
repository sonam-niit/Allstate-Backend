package com.allstate.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/allstate";
		String user="root";
		String password="Sonam@123";
		try {
			//load driver
			Class.forName(driver);
			Connection conn= DriverManager.getConnection(url, user, password);
			if(conn!=null)
				System.out.println("Connected");
			else
				System.out.println("Error Connecting in DB");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
