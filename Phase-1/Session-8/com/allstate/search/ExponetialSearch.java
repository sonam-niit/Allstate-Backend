package com.allstate.search;

import java.util.Arrays;

public class ExponetialSearch {

	public static int exponetialSearch(int arr[],int value) {
		
		//let's check the element is available at first index
		if(arr[0]==value) {
			return 0;
		}
		int i=1; 
		//we will get the range by executing this loop
		while(i<arr.length && arr[i]<=value) {
			i=i*2;
		}
		
		//call binary search method
		return Arrays.binarySearch(arr, i/2, Math.min(i, arr.length), value);
	}
	public static void main(String[] args) {
		int arr[]= {6,12,18,24,32,39};
		int searchValue=39;
		int result= exponetialSearch(arr, searchValue);
		if(result<0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+result+" value is "+arr[result]);
	}
}
