package com.allstate.first;

public class TypeCasting2 {

	public static void main(String[] args) {
		
		char c= 'A'; //char store ASCII value
		int d=c;
		System.out.println("char "+c);
		System.out.println("Int "+d);
		
		int z= d+32;
		char myChar= (char)z;
		System.out.println("Int "+z);
		System.out.println("MyChar "+ myChar);
		
	}
}
