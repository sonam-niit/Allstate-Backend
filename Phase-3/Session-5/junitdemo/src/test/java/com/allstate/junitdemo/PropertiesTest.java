package com.allstate.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

class PropertiesTest {

//	@Test
//	void test() {
//		Properties p=System.getProperties();
//		System.out.println(p);
//		System.out.println(System.getenv());
//	}

	@Test
	@EnabledIfSystemProperty(named="os.name",matches="Linux")
	public void runOnOS() {
		System.out.println("Run on linux os");
	}
	@Test
	@EnabledIfEnvironmentVariable(named="USER",matches="sonamgravitygma")
	public void runonUser() {
		System.out.println("Run on perticulr User system");
	}
	
}
