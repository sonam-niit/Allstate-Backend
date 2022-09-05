package com.allstate.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

	public static Connection getConnect() {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/allstate";
		String user = "root";
		String password = "Sonam@123";
		Connection conn = null;
		try {
			// load driver
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("Connected");
			} else
				System.out.println("Error Connecting in DB");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getErrorCode());// give you error code
		}

		return conn;

	}
}
