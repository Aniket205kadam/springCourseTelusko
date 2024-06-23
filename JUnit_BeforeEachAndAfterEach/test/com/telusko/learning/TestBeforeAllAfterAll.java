package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAllAfterAll {
	Shapes shape;
	
	@BeforeAll
	static void beforeAll() { //for this annotation must be static method
		System.out.println("Before All test");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All test");
	}
	
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
