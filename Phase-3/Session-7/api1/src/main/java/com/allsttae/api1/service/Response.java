package com.allsttae.api1.service;

import com.allsttae.api1.entity.Person;

public class Response {

	Person person;
	String hobby;
	public Response() {}
	public Response(Person person, String hobby) {
		super();
		this.person = person;
		this.hobby = hobby;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
