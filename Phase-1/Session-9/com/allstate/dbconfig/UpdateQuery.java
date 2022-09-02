package com.allstate.dbconfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery {

	public static void main(String[] args) throws SQLException {
		
		Connection conn= DBConfig.getConnect();
		String query="update product set name=?, price=?,description=? where id=?";
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
		stmt.setInt(4, 2);
		int x= stmt.executeUpdate();
		if(x>0)
			System.out.println("Data Updated");
		else
			System.out.println("Error while Updating Data");
		stmt.close();
		conn.close();
	}
}
