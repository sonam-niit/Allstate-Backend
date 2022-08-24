package com.allstate.inner;

public class MethodLocalInner {

	//write a inner class inside a method
	
	public void display() {
		
		class Inner{
			void print() {
				System.out.println("Method called from inner class");
			}
		}
		//Class create inside a method so that you can use it inside a method a method only
		
		Inner obj= new Inner();//object creation is possible inside the method only
		obj.print();
	}
	
	public static void main(String[] args) {
		MethodLocalInner m= new MethodLocalInner();
		m.display();
	}
}
