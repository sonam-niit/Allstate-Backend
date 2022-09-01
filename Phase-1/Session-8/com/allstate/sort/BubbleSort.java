package com.allstate.sort;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
	}
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void printArray(int arr[]) {
		System.out.println("Sorted Array");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = { 5, 1, 4, 2, 8 };
		bubbleSort(arr);
		printArray(arr);
	}
}
