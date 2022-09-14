package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each of outer Class");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each of Outer Class");
	}

	@Test
	void test() {
		System.out.println("Test Case of Outer Class");
	}
	@Nested
	class Inner{
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each of inner Class");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each of Inner Class");
		}

		@Test
		void testinner() {
			System.out.println("Test Case of Inner Class");
		}
		
		@Nested
		class InnerShell{
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each of innerShell Class");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each of InnerShell Class");
			}

			@Test
			void testinner() {
				System.out.println("Test Case of InnerShell Class");
			}
		}
	}

}
