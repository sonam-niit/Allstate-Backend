package com.allsttae.api2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allsttae.api2.entity.Hobby;
import com.allsttae.api2.service.HobbyService;

@RestController
@RequestMapping("/api/hobby")
public class HobbyController {

	@Autowired
	private HobbyService service;
	
	@GetMapping("")
	public List<Hobby> findAll(){
		return service.finadAll();
	}
	@GetMapping("{personId}")
	public String findByPersonId(@PathVariable int personId){
		return service.findByPersonId(personId);
	}
	@PostMapping("")
	public ResponseEntity<Object> saveHobby(@RequestBody Hobby hobby){
		Hobby saved= service.save(hobby);
		if(saved!=null)
			return new ResponseEntity<Object>(saved,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("error",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
