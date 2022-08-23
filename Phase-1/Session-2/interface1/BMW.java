package com.allstate.interface1;

//concrete class 
public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW Start method");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW stop method");
		
	}

	@Override
	public void changeGear(int n) {
		System.out.println("gear changed to "+n);
		
	}

	
}
