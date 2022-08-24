package com.allstate.array;

import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 50 };
		System.out.println("Access element at index 3: " + array[3]);

		String myArray[] = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<myArray.length; i++) {
			System.out.println("Enter any String");
			myArray[i]=sc.next();
		}
		
		System.out.println("Print Array");
		for(String x:myArray)
			System.out.println(x);
	}
}
