package com.allstate.inheritance;

public class Sub extends Super{
	
	public static void main(String[] args) {
		Sub s= new Sub();  //object of child class
		
		s.print(); // child can access all the properties and behaviour of parent class
		//System.out.println(s.num);  //gives and error
		//child can not access private properties of parent class
	} 
}
