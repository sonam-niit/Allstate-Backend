package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class MyExecutable implements Executable{

	@Override
	public void execute() throws Throwable {
		System.out.println("this is my Executable class");
		
	}
	
}
class DynamicTestDemo {

	@TestFactory
	Collection<DynamicTest> createDynamicTests(){
		return Arrays.asList(
				dynamicTest("Test1", ()->assertTrue(12>0)),
				dynamicTest("Test2", ()->assertFalse(0>1)),
				dynamicTest("Test3", ()->assertEquals(10, 7+3)),
				dynamicTest("Test4",()->assertNull(null)),	
				dynamicTest("Test5", new MyExecutable())
				);
	}

}
