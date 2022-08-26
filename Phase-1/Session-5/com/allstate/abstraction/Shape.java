package com.allstate.abstraction;

public abstract class Shape {

	private String color;
	abstract double area(); //no code defination
	
	public Shape(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}
	
}
