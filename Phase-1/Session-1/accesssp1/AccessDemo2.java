package com.allstate.first.accesssp1;

public class AccessDemo2 {

	public static void main(String[] args) {
		
		//let's all variables in Another class But same package
		

		AccessDemo1 obj= new AccessDemo1();
		System.out.println("Public "+obj.numPublic);
		//System.out.println("Private "+obj.numPrivate);
		System.out.println("Protecte "+obj.numProtected);
		System.out.println("Default "+obj.numDefault);
	}
}
