package com.allstate.checked;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
