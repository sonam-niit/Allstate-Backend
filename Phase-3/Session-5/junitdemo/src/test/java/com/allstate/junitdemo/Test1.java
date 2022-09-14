package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Test Case")
class Test1 {

	@BeforeAll
	public static void setupAll() {
		System.out.println("Before All");
	}
	@AfterAll
	public static void teardownAll() {
		System.out.println("After All");
	}
	@BeforeEach
	public void setup() {
		System.out.println("Before Each Method");
	}
	@AfterEach
	public void teardown() {
		System.out.println("Afer Each Method");
	}
	@Test
	@DisplayName("Addition Test")
	public void mytest1() {
		System.out.println("My First Test Case");
	}
	@Disabled
	@Test
	@DisplayName("Subtration Test")
	public void mytest2() {
		System.out.println("My Second Test Case");
	}

}
