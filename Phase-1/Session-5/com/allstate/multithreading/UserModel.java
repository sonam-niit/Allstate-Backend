package com.allstate.multithreading;

public class UserModel extends Thread{

	private String user;
	private String password;
	private Login login= new Login();
	
	public UserModel(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	@Override
	public void run() {
		login.authenticate(user, password);
	}
}
