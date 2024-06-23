package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	Shapes shape;
	
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before test");
	}

	@Test
	void testComputeSquareArea() {
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("computeSquareArea() method test is done");
		
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("computeCircleArea() method test is done");
	}
	
	@AfterEach
	void destroy() {
		System.out.println("After test");
		//close the resources
	}

}
