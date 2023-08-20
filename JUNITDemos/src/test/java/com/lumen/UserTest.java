package com.lumen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UserTest {
	User user;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Each");
	}

	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		user = null;
	}
	
	@Test
	@DisplayName("Testing greet")
	@Tag("greet")
	void testGreet() {
		assertEquals("Hello Priya", user.greet("Priya"));
		assertNotNull(user.greet("Helen"));
	}
	@Test
	@DisplayName("Testing fruits")
	void testShowFruits() {
		List<String> fruits = Arrays.asList("Mango","Apple");
		assertEquals(fruits, user.showFruits());
	}
	
	@Test
	@DisplayName("Testing fruits length")
	void testFruitsLength() {
		List<String>fruits = user.showFruits();
		assertEquals(2,fruits.size());
	}

	

}
