package com.allstate.dao;

import java.util.List;

import com.allstate.entity.User;

public interface UserDao {

	public int addUser(User user);
	public int updateUser(User user);
	public boolean deleteUser(int id);
	public List<User> findAllUsers();
	public User findUserById(int id);
}
