package com.allsttae.api1.controller;

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

import com.allsttae.api1.entity.Person;
import com.allsttae.api1.service.PersonService;
import com.allsttae.api1.service.Response;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@PostMapping("")
	public ResponseEntity<Object> savePerson(@RequestBody Person person){
		Person saved= service.save(person);
		if(saved!=null)
			return new ResponseEntity<Object>(saved,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("erro while inserting",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("")
	public List<Person> getAll(){
		return service.findAll();
	}
	@GetMapping("{id}")
	public ResponseEntity<Object> getById(@PathVariable int id){
		Response resp= service.getPersonById(id);
		if(resp!=null)
			return new ResponseEntity<Object>(resp,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No user available",HttpStatus.NOT_FOUND);
	}
}
