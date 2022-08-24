package com.allstate.string;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1= "Hello World";
		String s2= "Hello World";
		
		String s3= new String("Good Morning");
		String s4= new String("Good Morning");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}
}
