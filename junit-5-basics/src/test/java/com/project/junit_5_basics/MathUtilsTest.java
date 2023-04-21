package com.project.junit_5_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This must be run before all");
	}
	
	@BeforeEach
	void init() {
		mathUtils=new MathUtils();
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning up...");
	}

	@Test
	@Disabled
	@DisplayName("Testing add method")
	void testAdd() {
		int expected=2;
		int actual=mathUtils.add(1,1);
		assertEquals(expected, actual,"The add methode should add two numbers");
	}
	
	@Test
//	@EnabledOnOs(OS.LINUX)
	void testDevide() {
		
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"Divide by zero should throw exceprion");
	}
	
	@Nested
	@DisplayName("Addition class")
	@Tag("Math")
	class AddTest {
		@Test
		@DisplayName("Testing add method for +")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1,1),"The add methode should add two numbers");
		}
		
		@Test
		@DisplayName("Testing add method for -")
		void testAddNegative() {
			int expected=2;
			int actual=mathUtils.add(1,1);
			assertEquals(expected, actual,()->"This should return sum "+expected+" but returned "+actual);
		}
	}
	
	@Test
	void testMultiply() {
		assertAll(
				()-> assertEquals(4,mathUtils.multiply(2,2)),
				()-> assertEquals(0,mathUtils.multiply(2,0)),
				()-> assertEquals(-2,mathUtils.multiply(2,-1))
				);
	}
	
	@Test
	@Tag("Circle")
	void testComputeCircleRadius() {
		
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"Should return the right circle area");
	}

}
