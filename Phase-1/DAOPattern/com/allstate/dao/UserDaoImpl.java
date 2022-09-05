package com.allstate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allstate.dbconfig.DBConfig;
import com.allstate.entity.User;

public class UserDaoImpl implements UserDao{

	Connection conn;
	public UserDaoImpl() {
		conn=DBConfig.getConnect();
	}
	
	@Override
	public int addUser(User user) {
		
		String sql="insert into user (name,email,password) values(?,?,?)";
		try {
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			
			return stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAllUsers() {
		
		PreparedStatement stmt;
		List<User> users=null;
		try {
			stmt = conn.prepareStatement("select * from user");
			ResultSet set=stmt.executeQuery();
			users= new ArrayList<>();
			while(set.next()) {
				users.add(new User(set.getInt(1),set.getString(2), 
						set.getString(3), set.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
		
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
