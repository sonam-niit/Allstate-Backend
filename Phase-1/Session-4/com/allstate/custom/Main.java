package com.allstate.custom;

import java.util.Scanner;

public class Main {

	void findById(int id) throws ProductNotFoundException {
		if (id == 0) {
			throw new ProductNotFoundException("No product available");
		} else {
			System.out.println("Product Found");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product Id");
		int id = sc.nextInt();

		Main m= new Main();
		try {
			m.findById(id);
		}
		catch(ProductNotFoundException e) {
			e.printStackTrace();
		}
	}
}
