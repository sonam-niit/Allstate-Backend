package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	@DisplayName("MyTest")
	@RepeatedTest(value=5, name="TestCase:{displayName} the currentCount is "
			+ "{currentRepetition} out of {totalRepetitions}")
	void test() {
		System.out.println("Test Executed");
	}

}
