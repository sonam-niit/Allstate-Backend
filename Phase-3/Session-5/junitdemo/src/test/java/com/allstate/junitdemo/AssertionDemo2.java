package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionDemo2 {

	Logics logic;
	@BeforeEach
	public void setUp() {
		logic= new Logics();
	}
	@AfterEach
	public void tearDown() {
		logic=null;
	}
	@Test
	void test1() {
		assertTrue(logic.checkAge(19));
		assertFalse(logic.checkAge(10));
	}
	@Test
	void test2() {
		assertNull(null);
		assertNotNull("sonam");
	}
	@Test
	void test3() {
		assertThrows(ArithmeticException.class, ()->{int div= 10/0;});
	}
	
}
