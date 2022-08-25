package com.allstate.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private int id;
	private String name;
	private String email;
	
	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public static void main(String[] args) {
		
		Student s1= new Student(1,"sonam","sonam@gmail.com");
		//store the object in memory it is converted into byte stream
		
		System.out.println(s1.email); // byte stream converted in to Object
		//deserialization
		
	}
	
}
