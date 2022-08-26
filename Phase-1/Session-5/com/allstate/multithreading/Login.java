package com.allstate.multithreading;

public class Login {

	public void authenticate(String user,String password) {
		if(user.equals("admin") && password.equals("admin123"))
			System.out.println("User Authenticated");
		else
			System.out.println("Invalid Login credentials");
	}
}
