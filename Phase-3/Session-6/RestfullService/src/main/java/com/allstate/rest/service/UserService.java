package com.allstate.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.rest.entity.User;
import com.allstate.rest.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User addUser(User user) {
		return repo.save(user);
	}
	public List<User> getAllUsers() {
		return repo.findAll();
	}
	public User updateUser(User user, int id) {
		if(repo.findById(id).isPresent())
		{
			User oldUser=repo.findById(id).get();
			oldUser.setName(user.getName());
			oldUser.setEmail(user.getEmail());
			oldUser.setPassword(user.getPassword());
			oldUser.setCountry(user.getCountry());
			
			return repo.save(oldUser);
			//it will update the same object which is there in DB
		}
		return null;
	}
	public User getById(int id) {
		if(repo.findById(id).isPresent())
		{
			return repo.findById(id).get();
		}
		return null;
	}
	public boolean deleteUser(int id) {
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return true;
		}
		return false;
	}
}
