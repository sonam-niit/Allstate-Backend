package com.allstate.inner;

public class Outer {

	private int num=20;
	
	class Inner{
		
		private int innerNum=10;
		void display() {
			System.out.println("Inner class Method called");
			System.out.println("inner class Variable "+innerNum);
			System.out.println("outer class variable "+num);
		}
		
		class InnerDepth{
			int a=30;
		}
	}
	
	public static void main(String[] args) {
		Outer outObj= new Outer();
		Outer.Inner innerobj= outObj.new Inner();
		//call inner class method
		innerobj.display();
		//access inner class member to outerclass
		System.out.println(innerobj.innerNum);
		
		Outer.Inner.InnerDepth depth= innerobj. new InnerDepth();
		System.out.println(depth.a);
	}
}
