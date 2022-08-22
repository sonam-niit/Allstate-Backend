package com.allstate.first;

public class LoopDemo {

	public static void main(String[] args) {
		
		System.out.println("Using while");
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++; // increase the value by 1
		}
		
		System.out.println("Using do while");
		i=1;
		do {
			System.out.println(i);
			i++; // increase the value by 1
		}while(i<=10);
		
		System.out.println("For loop");
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
