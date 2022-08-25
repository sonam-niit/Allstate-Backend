package com.allstate.unchecked;

import java.io.FileReader;

public class MultiCatch {

	void divide(int a, int b) {
		System.out.println(a / b);
	}

	void printElementArray(int array[]) {
		System.out.println(array[1]);
	}

	void length(String name) {
		System.out.println(name.length());
	}

	public static void main(String[] args) {

		MultiCatch m = new MultiCatch();
		try {
			m.divide(10, 2);
			int arr[] = { 10, 20, 30, 40 };
			m.printElementArray(arr);
			m.length("sonam");
			
			FileReader read= new FileReader("");
		} catch (ArithmeticException e) {
			System.out.println("can not divide by Zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("can not access out bound Index");
		}catch (NullPointerException e) {
			System.out.println("Can not call string methods on null object");
		} catch (Exception e) {
			System.out.println("General Exception");
		}
	}
}
