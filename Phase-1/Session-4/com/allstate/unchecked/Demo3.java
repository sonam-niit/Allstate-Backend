package com.allstate.unchecked;

public class Demo3 {

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 50, 60 };

		try {
			System.out.println(array[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		// ArrayIndexOutOfBoundException
	}
}
