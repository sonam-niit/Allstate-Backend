package com.allstate.method;

public class MethodOverload {

	// only need to check same name and different parameters
	// no need to check return type
	//compile time polymorphism (early binding)
	public int add(int a, int b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
	public double add(double a, double b,double c) {
		return a + b+c;
	}

	public static void main(String[] args) {

		MethodOverload obj = new MethodOverload();
		System.out.println(obj.add(23.00, 45.00)); // it will call method with double para
		System.out.println(obj.add(23.0f, 12.9f));// call method with float para
		System.out.println(obj.add(2, 3));// call method with int parameter
		System.out.println(obj.add(23.00, 45.00,89.00)); // call method with 3 para
	}
}
