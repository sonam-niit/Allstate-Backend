package com.allsttae.api2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allsttae.api2.entity.Hobby;
import com.allsttae.api2.repo.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	private HobbyRepository repo;
	
	public String findByPersonId(int personId) {
		return repo.findByPersonId(personId);
	}
	public Hobby save(Hobby hobby) {
		return repo.save(hobby);
	}
	public List<Hobby> finadAll(){
		return repo.findAll();
	}
}
