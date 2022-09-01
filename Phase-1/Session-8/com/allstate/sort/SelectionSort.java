package com.allstate.sort;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int index = i; // storing i value in index so we can swap to smallest number with first index
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// smallest index
				}
			}
			swap(arr, i, index);
		}
	}
	public static void swap(int arr[], int i, int index) {
		int temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}

	public static void printArray(int arr[]) {
		System.out.println("Sorted Array");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = { 23, 12, 10, 15, 2, 3 };
		selectionSort(arr);
		printArray(arr);
	}
}
