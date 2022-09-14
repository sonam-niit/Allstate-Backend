package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalOsTest {
	
	@Test
	@EnabledOnOs(value=OS.WINDOWS)
	void runOnWindows() {
		System.out.println("This test case will run on windows");
	}
	@Test
	@EnabledOnOs(value=OS.LINUX)
	void runOnLinux() {
		System.out.println("This test case will run on Linux");
	}
	@Test
	@EnabledOnJre(value=JRE.JAVA_8)
	void runOnJRE8() {
		System.out.println("Run on JRE8");
	}
	@Test
	@EnabledOnJre(value=JRE.JAVA_10)
	void runOnJRE10() {
		System.out.println("Run on JRE10");
	}
}
