package com.allstate.method;

public class MethodDemo1 {

	// method without any parameters, no return value
	public void print() {
		System.out.println("Good Morning..!");
	}
	//method without parameters, returns String
	public String greetings() {
		return "Welcome";
	}
	// Parameterized method
	// method which is not returning any value
	public void square(int num) {
		System.out.print(num * num);
	}
	// returning int
	public int cube(int num) {
		return num * num * num;
	}
	public float convertToFerenhit(float c) {
		return ((c*9)/5)+32;
	}

	public static void main(String[] args) {
		MethodDemo1 obj= new MethodDemo1();
		obj.print();
		String response =obj.greetings(); //calling a method
		System.out.println(response);
		obj.square(3);//called by Value
		int result= obj.cube(4);
		System.out.println("Cube of 4 is "+result);
		System.out.println("Cube of 5 is "+ obj.cube(5));
		System.out.println("convertion of 70 degree "+ obj.convertToFerenhit(70)+" Ferenhit");
		
	}
}
