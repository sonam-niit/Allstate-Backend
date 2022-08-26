package com.allstate.abstraction;

public class Test {

	public static void main(String[] args) {
		
		//Shape is a ref and functionality is Circle
		Shape s1= new Circle("Blue", 3.5);
		//Shape is a ref and functionality is Rectangle
		Shape s2= new Rectangle("Red", 4, 7);
		
		System.out.println(s1);
		System.out.println(s2);
		//when you print the object It will call its toString Method
	}
}
