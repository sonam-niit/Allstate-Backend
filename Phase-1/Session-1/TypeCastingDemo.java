package com.allstate.first;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Implicit conversion
		byte a=20;
		short b=a; //storing byte value to int
		int c=b; //storing short to int
		long d=c; //storing int to long
		float e= d; //storing long to float
		double f=e; // storing float to double;
		
		System.out.println("Short "+b);
		System.out.println("Double "+f);
		
		//explicit conversion
		float x= (float) f; //cannot convert double to float
		System.out.println("Float "+x);
		
		int y=(int) x;
		System.out.println("Int "+y);
	}
}
