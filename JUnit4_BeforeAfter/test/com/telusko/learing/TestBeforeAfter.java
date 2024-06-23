package com.telusko.learing;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.telusko.learning.Cals;


public class TestBeforeAfter {
	
	Cals cals;
	
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
