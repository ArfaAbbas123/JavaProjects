package com.lumen.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lumen.training.Calculator;

class CalculatorTest {
	
	Calculator calculator;

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
		System.out.println("Before Each");
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		calculator = null;
	}

	@Test @DisplayName("Testing Sum - positive")
	 void testSum() {
		assertEquals(30, calculator.sum(10, 20),()->"Should be 30.0");   //when datatype is double them the asset will have 3 parameters
	}

	@Test @DisplayName("Testing product - positive")
	 void testProduct() {
		assertEquals(4, calculator.product(2, 2), ()->"Should be 4");	
		assertEquals(6, calculator.product(2, 3), ()->"Product should be 6");
		}

}
