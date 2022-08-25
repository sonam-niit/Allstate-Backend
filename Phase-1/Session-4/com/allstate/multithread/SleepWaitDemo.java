package com.allstate.multithread;

public class SleepWaitDemo extends Thread {

	static Object myObject= new Object();
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

		SleepWaitDemo t1 = new SleepWaitDemo();
		t1.setName("one");
		SleepWaitDemo t2 = new SleepWaitDemo();
		t2.setName("two");
		SleepWaitDemo t3 = new SleepWaitDemo();
		t3.setName("three");

		t1.start();
		t2.start();
		t3.start();
		
		synchronized (myObject) {
			try {
				myObject.wait(3000);
				System.out.println("Main thread invoked after wait of 3 sec");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
