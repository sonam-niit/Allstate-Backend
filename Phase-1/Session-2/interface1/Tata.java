package com.allstate.interface1;

//multiple inheritance is supported by interface
public class Tata implements Car, TataAdvanced {

	@Override
	public void start() {
		System.out.println("Tata Start method");
	}
	@Override
	public void stop() {
		System.out.println("Tata Stop method");

	}
	@Override
	public void changeGear(int n) {
		System.out.println("Tata gear Chnaged to " + n);

	}
	@Override
	public void electric() {
		System.out.println("Tata car is Electric");
	}

}
