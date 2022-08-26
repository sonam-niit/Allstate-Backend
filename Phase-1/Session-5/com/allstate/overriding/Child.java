package com.allstate.overriding;

public class Child extends Parent{

	public Child() {
		System.out.println("Child Class Constructor");
	}
	
	public void print() {
		super.print(); //this will call parent class print method
		System.out.println("Child class Print method");
	}
	
	public static void main(String[] args) {
		Child c= new Child();
		c.print();
	}
}
