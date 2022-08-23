package com.allstate.constructor;

public class Student {

	private int id;
	private String name;
	
	//Default Constructor
	public Student() {
		System.out.println("Constructor Called");
	}
	//Parameterized Constructor
	//this keyword is used to access class level variables
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Student s= new Student(1,"Sonam");
		System.out.println(s.id+" "+s.name);
	}
}


