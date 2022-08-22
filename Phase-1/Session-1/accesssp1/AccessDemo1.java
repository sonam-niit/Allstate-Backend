package com.allstate.first.accesssp1;

public class AccessDemo1 {

	public int numPublic=20;
	private int numPrivate=30;
	protected int numProtected=40;
	int numDefault=50; //default
	
	public static void main(String[] args) {
		//Let's access all variables in same class (accessible)
		
		AccessDemo1 obj= new AccessDemo1();
		System.out.println("Public "+obj.numPublic);
		System.out.println("Private "+obj.numPrivate);
		System.out.println("Protecte "+obj.numProtected);
		System.out.println("Default "+obj.numDefault);
	}
}
