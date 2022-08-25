package com.allstate.sync;

public class Users extends Thread{

	private String name;
	private String msg;
	private Sender res;
	
	public Users(String name,String msg,Sender res) {
		this.name=name;
		this.msg=msg;
		this.res= res;
	}
	@Override
	public void run() {
		
		synchronized (res) {
			res.send(name, msg);
		}
		
	}
}
