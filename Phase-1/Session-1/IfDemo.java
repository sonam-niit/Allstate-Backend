package com.allstate.first;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {

		float percent;
		Scanner sc = new Scanner(System.in); //created object of scanner class
		System.out.println("Enter percentage");
		percent= sc.nextFloat();
		if (percent>=70 && percent <=100) {
			System.out.println("Distinction");
		} 
		else if(percent>=60 && percent <70) {
			System.out.println("First class");
		}
		else if(percent>=50 && percent <60) {
			System.out.println("Second class");
		}
		else if(percent>=35 && percent <50) {
			System.out.println("Pass class");
		}
		else if(percent>=0 && percent <35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter Correct percentage");
		}
		
		sc.close();//close the object when utilization of that object completed
	}
}
