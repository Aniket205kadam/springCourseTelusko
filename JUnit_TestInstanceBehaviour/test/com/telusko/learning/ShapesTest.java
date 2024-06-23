package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {
	Shapes shape = new Shapes();
	
	public ShapesTest() {
		System.out.println("ShapesTest class object is created");
	}
	
	@BeforeAll
	void beforeAll() {
		System.out.println("Before all test");
	}

	@Test
	void testComputeSquareArea() {
		System.out.println("For square test is executed");
		assertEquals(16, shape.computeSquareArea(4));
	}
	
	@Test
	void testComputeCircleArea() {
		System.out.println("For circle test is executed");
		assertEquals(314, shape.computeCircleArea(10));
	}

}
