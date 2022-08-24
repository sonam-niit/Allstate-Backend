package com.allstate.interface1;

public class MainAnno {

	public static void main(String[] args) {
		
		Car sachinTendCar= new Car() {
			
			@Override
			public void stop() {
				System.out.println("Sachin tendulkar car Stopped");
			}
			
			@Override
			public void start() {
				System.out.println("Sachin tendulkar car Started");
			}
		};
		
		sachinTendCar.start();
		sachinTendCar.stop();
	}
}
