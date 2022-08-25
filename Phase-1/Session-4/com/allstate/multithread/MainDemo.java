package com.allstate.multithread;

public class MainDemo extends Thread {

	static int count = 0;

	@Override
	public void run() {
		while (count <= 10) {
			System.out.println(currentThread().getName() + " " + ++count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		MainDemo t1 = new MainDemo();
		t1.start();
		while (count <= 10) {
			System.out.println(currentThread().getName() + " " + ++count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main thread completed");
	}
}
