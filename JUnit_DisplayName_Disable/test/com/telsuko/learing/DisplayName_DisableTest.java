package com.telsuko.learing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.telusko.learning.Shapes;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DisplayName_DisableTest {

	Shapes shape = new Shapes();
	
	
	@BeforeAll
	void beforeAll() {
		System.out.println("Before all test");
	}

	@Test
	@DisplayName("Testing area of square method")
	void testComputeSquareArea() {
		System.out.println("For square test is executed");
		assertEquals(16, shape.computeSquareArea(4));
	}
	
	@Test
	@Disabled
	@DisplayName("Testing area of rectangle method")
	void testComputeRectangleArea() {
		System.out.println("For Rectangle test is executed");
		assertEquals(60, shape.computeRectangleArea(10, 6));
	}
	
	@Test
	@DisplayName("Testing area of circle method")
	void testComputeCircleArea() {
		System.out.println("For circle test is executed");
		assertEquals(314, shape.computeCircleArea(10));
	}
}
