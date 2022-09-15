package com.allsttae.api1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.allsttae.api1.entity.Person;
import com.allsttae.api1.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;
	
	public Person save(Person person) {
		return repo.save(person);
	}
	public List<Person> findAll(){
		return repo.findAll();
	}
	public Response getPersonById(int id) {
		
		if(repo.findById(id).isPresent()) {
			Person person= repo.findById(id).get();
			RestTemplate template=new RestTemplate();
			String hobby= template.getForObject("http://localhost:8082/api/hobby/"+id, String.class);
			
			return new Response(person,hobby);
		}
		return null;
	}
}
