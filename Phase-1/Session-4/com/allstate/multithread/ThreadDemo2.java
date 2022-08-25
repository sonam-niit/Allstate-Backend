package com.allstate.multithread;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Started");
	}
	
	public static void main(String[] args) {
		
		Runnable target1= new ThreadDemo2();//Runnable ref
		Thread t1= new Thread(target1);
		t1.start();
		
		Runnable target2= new ThreadDemo2();
		Thread t2= new Thread(target2);
		t2.start();
		
	}

}
