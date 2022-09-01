package com.allstate.sort;

public class InsertionSort {

	public static void insertionSort(int arr[]) {
		
		for(int j=1;j<arr.length;j++) {
			int key= arr[j];
			int i=j-1;
			
			while((i>-1)&& (arr[i]>key)) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}
	public static void printArray(int arr[]) {
		System.out.println("Sorted Array");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {12,11,13,5,6};
		insertionSort(arr);
		printArray(arr);
	}
}
