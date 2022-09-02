package com.allstate.dbconfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {

	public static void main(String[] args) throws SQLException {
		
		Connection conn= DBConfig.getConnect();
		String query="insert into product(name,price,description) values(?,?,?)";
		PreparedStatement stmt= conn.prepareStatement(query);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Product name");
		String name= sc.nextLine();
		System.out.println("Enter Product Price");
		int price= Integer.parseInt(sc.nextLine());
		System.out.println("Enter Product Description");
		String desc= sc.nextLine();
		stmt.setString(1, name);
		stmt.setInt(2, price);
		stmt.setString(3, desc);
		int x= stmt.executeUpdate();
		if(x>0)
			System.out.println("Data Inserted");
		else
			System.out.println("Error while inserting Data");
		stmt.close();
		conn.close();
	}
}
