package com.allstate.custom;

public class ProductNotFoundException 
extends Exception {

	public ProductNotFoundException(String msg){
		super(msg);
	}
	
}
//throw is used to throw an exception
//throws you can declare the declare the exception
//with method name

//In main method you can handle that exception
//by using trycatch block