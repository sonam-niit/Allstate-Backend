package com.allstate.unchecked;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		try {
			int div= num1/num2;
			System.out.println("Division "+ div);
		}
		catch (ArithmeticException e) {
			System.out.println("Error occured: "+e.getMessage());
			System.out.println("Kindly try after sometime");
		}
		finally {
			sc.close();
			System.out.println("scanner closed");
		}
		
	}
}
