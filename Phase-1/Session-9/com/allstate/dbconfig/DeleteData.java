package com.allstate.dbconfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) throws SQLException {
		Connection conn= DBConfig.getConnect();
		String sql= "delete from product where id=?";
		PreparedStatement stmt= conn.prepareStatement(sql);
		stmt.setInt(1, 3);
		
		int x=stmt.executeUpdate();
		if(x>0)
			System.out.println("Record Deleted Successfuly");
		else
			System.out.println("No record available to delete");
		stmt.close();
		conn.close();
	}
}
