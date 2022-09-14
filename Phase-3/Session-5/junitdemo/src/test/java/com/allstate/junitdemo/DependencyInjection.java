package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Dependency Injection Example")
class DependencyInjection {

	public DependencyInjection(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
	}
	
	@Test
	@DisplayName("Test one")
	void test1(TestInfo testinfo) {
		assertEquals("Test one", testinfo.getDisplayName());
	}

	@Test
	@DisplayName("Test Two")
	@Tag("mytag")
	void test2(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
		System.out.println(testinfo.getTags());
		System.out.println(testinfo.getTestClass());
		System.out.println(testinfo.getTestMethod());
//		assertEquals("Test Two", testinfo.getDisplayName());
//		assertTrue(testinfo.getTags().contains("mytag"));
	}
}
