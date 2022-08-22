package com.allstate.first.accesssp2;

import com.allstate.first.accesssp1.AccessDemo1;

//AccessDemo1 is parent and AccessDemo4 is child
public class AccessDemo4 extends AccessDemo1{

	public static void main(String[] args) {
		
		AccessDemo4 obj = new AccessDemo4();
		
		System.out.println("Public "+obj.numPublic);
		System.out.println("Private "+obj.numPrivate);
		System.out.println("Protecte "+obj.numProtected);
		System.out.println("Default "+obj.numDefault);
	}
}
