package com.allstate.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticInsert {

public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/allstate";
		String user="root";
		String password="Sonam@123";
		Connection conn=null;
		try {
			//load driver
			Class.forName(driver);
			conn= DriverManager.getConnection(url, user, password);
			if(conn!=null)
			{	
				System.out.println("Connected");
				String query="insert into product (name,price,description) values"
						+ "('pencil',5,'easy to use')";
				Statement stmt= conn.createStatement();
				int x=stmt.executeUpdate(query);
				if(x>0)
					System.out.println("Data inserted successfully");
				else
					System.out.println("No data inserted");
			}
			else
				System.out.println("Error Connecting in DB");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
