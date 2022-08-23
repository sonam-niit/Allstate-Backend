package com.allstate.interface1;

public class Main {

	public static void main(String[] args) {
		
		Car sonamCar= new BMW();
		sonamCar.start(); //implementation hidden 
		sonamCar.stop();
		sonamCar.changeGear(3);
		
		Car harshCar= new Tata();
		harshCar.start();
		harshCar.changeGear(4);
		harshCar.stop();
		
	}
}
