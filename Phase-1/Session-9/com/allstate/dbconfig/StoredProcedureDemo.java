package com.allstate.dbconfig;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/*Query:
create procedure add_product(IN pname varchar(100),IN pprice int, IN pdesc varchar(200)) 
insert into product (name,price,description) values(pname,pprice,pdesc);

//call:  call add_product('scale',15,'handy');
*/
public class StoredProcedureDemo {

	public static void main(String[] args) {
		
		Connection conn = DBConfig.getConnect();
		CallableStatement stmt;
		try {
			stmt = conn.prepareCall("call add_product(?,?,?)");
			stmt.setString(1, "Eraser");
			stmt.setInt(2, 20);
			stmt.setString(3, "Pack of 4");
			
			int x= stmt.executeUpdate();
			if(x>0)
				System.out.println("Data Inserted");
			else
				System.out.println("Error while Inserting a data");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
	}
}
