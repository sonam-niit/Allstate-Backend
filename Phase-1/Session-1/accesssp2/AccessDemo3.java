package com.allstate.first.accesssp2;

import com.allstate.first.accesssp1.AccessDemo1;

public class AccessDemo3 {

	//access in different package
	public static void main(String[] args) {
		AccessDemo1 obj= new AccessDemo1();
		System.out.println("Public "+obj.numPublic);
		System.out.println("Private "+obj.numPrivate);
		System.out.println("Protecte "+obj.numProtected);
		System.out.println("Default "+obj.numDefault);
	}
}
