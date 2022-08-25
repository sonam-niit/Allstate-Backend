package com.allstate.multithread;

public class ThreadDemo1 extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000); //thread will wait for 1 sec
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 thread1= new ThreadDemo1();
		thread1.start();
		ThreadDemo1 thread2= new ThreadDemo1();
		thread2.start();
	}
}
