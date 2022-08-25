package com.allstate.sync;

public class Sender {
	public void send(String name, String msg) {
		System.out.println(name+ " is sending a message");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg +" Message sent successfully from "+name);
	}
}
