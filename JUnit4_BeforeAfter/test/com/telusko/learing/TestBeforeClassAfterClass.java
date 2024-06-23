package com.telusko.learing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.telusko.learning.Cals;

public class TestBeforeClassAfterClass {

	Cals cals;
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("Before All the test cases:");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("After ALl the test cases:");
	}
	
	@Before
	public void init() {
		cals = new Cals();
		System.out.println("Before test");
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, cals.add(8, 2));
		System.out.println("Add test");
	}
	
	@Test
	public void testMulti() {
		assertEquals(10, cals.multi(5, 2));
		System.out.println("Multi test");
	}
	
	@After
	public void destroy() {
		System.out.println("After test");
	}

}
