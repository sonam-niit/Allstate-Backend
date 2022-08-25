package com.allstate.sync;

public class Main {

	public static void main(String[] args) {
		
		Sender send= new Sender(); // common res
		
		Users sonam= new Users("Sonam Soni", "Hello Good Monring", send);
		Users aditi= new Users("Aditi", "Good Afternoon", send);
		Users vishal= new Users("vishal", "Bye bye", send);
		
		sonam.start();
		aditi.start();
		vishal.start();
	}
}
