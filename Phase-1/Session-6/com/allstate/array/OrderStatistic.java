package com.allstate.array;

import java.util.Arrays;

public class OrderStatistic {

	public static int kthsmallest(int num[],int k) {
		
		//sort the given array
		Arrays.sort(num);
		//let's return the kth smallest element from sorted array
		return num[k-1];
	}
	
	//main method
	public static void main(String[] args) {
		int array[]= {12,3,6,19,10,5};
		
		System.out.println("4th smallest: "+kthsmallest(array, 4));
		System.out.println("3th smallest: "+kthsmallest(array, 3));
	}
}
