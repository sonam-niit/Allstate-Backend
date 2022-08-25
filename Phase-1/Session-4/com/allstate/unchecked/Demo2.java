package com.allstate.unchecked;

public class Demo2 {

	public static void main(String[] args) {

		String name = null;
		String input = "Sonam";
		// throwing nullPointerException
		try {
			if (name.equals(input))
				System.out.println("Valid User");
			else
				System.out.println("Invalid User");
			
		} catch (NullPointerException e) {
			System.out.println("Exception occured " + e.getMessage());
		}
	}
}
