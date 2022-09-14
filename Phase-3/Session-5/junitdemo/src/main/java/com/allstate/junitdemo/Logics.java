package com.allstate.junitdemo;

public class Logics {

	public boolean checkAge(int age) {
		return age>=18;
	}
	public String getName(String name) {
		if(name==null)
			return null;
		return name.toUpperCase();
	}
}
