package com.allstate.interface1;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW start method");
		
	}
	@Override
	public void stop() {
		System.out.println("BMW stop method");
	}

}
