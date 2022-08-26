package com.allstate.abstraction;

public class Circle extends Shape{

	private double radius;
	
	public Circle(String color,double radius) {
		super(color); //passing to parent class constructor
		this.radius= radius;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		return "Circle color "+getColor()+" and Area is "+area();
	}

	
}
