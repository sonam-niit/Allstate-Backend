package com.allstate.search;

public class LinearSearch {

	public static boolean linearSearch(int arr[], int key) {

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };

		if (linearSearch(arr, 70)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
