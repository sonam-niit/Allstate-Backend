package com.allstate.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allstate.rest.entity.User;
import com.allstate.rest.service.UserService;

@RestController
@RequestMapping("/users/api")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	@GetMapping("{id}")
	public ResponseEntity<Object> getById(@PathVariable int id){
		User saved= service.getById(id);
		if(saved!=null)
			return new ResponseEntity<Object>(saved,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User not available",HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<Object> deletById(@PathVariable int id){
		if(service.deleteUser(id))
			return new ResponseEntity<Object>("User deleted",HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User not available",HttpStatus.NOT_FOUND);
	}
	@PutMapping("{id}")
	public ResponseEntity<Object> updateUser(@RequestBody User user,
			@PathVariable int id){
		User updated= service.updateUser(user, id);
		if(updated!=null)
			return new ResponseEntity<Object>(updated,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User not available for update",
					HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("")
	public ResponseEntity<Object> saveUser(@RequestBody User user){
		User saved=service.addUser(user);
		if(saved!=null)
			return new ResponseEntity<Object>(saved,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while creating user object",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
