package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

class ScriptTest {

	boolean myTest() {
		return true;
	}
	
	@Test
	@EnabledIf("myTest")
	void test() {
		System.out.println("Executed when condition returns true");
	}

}
