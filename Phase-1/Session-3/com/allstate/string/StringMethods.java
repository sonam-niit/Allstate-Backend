package com.allstate.string;

public class StringMethods {

	public static void main(String[] args) {
		String s1= new String("Hello World");
		
		System.out.println("get the string length: "+s1.length());
		System.out.println("Get the character at index 2: "+s1.charAt(2));
		System.out.println(s1.concat("Test"));
		System.out.println(s1.endsWith("World"));
		System.out.println(s1.startsWith("Hell"));
		System.out.println(s1.contains("llo"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(0,5));
		
		String s3="               test   hello           ";
		System.out.println("Length before trim: "+s3.length());
		System.out.println("Length After trim: "+s3.trim().length());
		//System.out.println(s3.stripLeading().length());
		
		String username="Admin";
		if(username.equalsIgnoreCase("admin"))
			System.out.println("User found");
		else
			System.out.println("No user available");
		
		//equals compare the value as it is
		//equalsIgnoreCase compare without case
	}
	
}
