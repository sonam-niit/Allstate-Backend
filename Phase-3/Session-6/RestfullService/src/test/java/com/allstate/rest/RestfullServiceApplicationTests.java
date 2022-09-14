package com.allstate.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.allstate.rest.entity.User;
import com.allstate.rest.service.UserService;

@SpringBootTest
class RestfullServiceApplicationTests {

	@Autowired
	private UserService service;
	
	@Disabled
	@Test
	void addUserTest() {
		assertNotNull(service.addUser(new User("sonam", "sonam@gmail.com", "1234", "india")));
	}

	@Test
	void checkFindAll() {
		assertEquals(1, service.getAllUsers().size());
	}
}
