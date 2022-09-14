package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionDemo {

	Calculator cal;
	@BeforeEach
	public void setUp() {
		cal=new Calculator();
	}
	@AfterEach
	public void tearDown() {
		cal=null;
	}
	@Test
	void test1() {
		assertEquals(9, cal.add(4, 5));
		assertEquals(8, cal.sub(16, 8));
		assertEquals(9, cal.mul(3, 3));
		assertEquals(2, cal.div(4, 2));
	}

	
}
