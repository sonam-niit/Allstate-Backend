package com.allstate.multithreading;

public class MultiThread {

	public static void main(String[] args) {
		
		UserModel sonam= new UserModel("admin", "admin123");
		UserModel alex= new UserModel("HR", "HR@123");
		
		sonam.start();
		alex.start();
	}
}
