package com.allstate.oops;

public class DemoEncap {

	public static void main(String[] args) {
		Encaptulation obj= new Encaptulation();
		
		obj.setId(1);
		obj.setEmail("sonam@gmai.com");
		obj.setName("Sonam Soni");
		
		System.out.println("Id: "+obj.getId());
		System.out.println("Name: "+obj.getName());
		System.out.println("Email: "+obj.getEmail());
	}
}
