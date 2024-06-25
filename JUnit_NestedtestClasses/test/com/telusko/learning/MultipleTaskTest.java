package com.telusko.learning;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MultipleTaskTest {
	private MultipleTask task;
	
	@BeforeAll
	void init() {
		task = new MultipleTask();
	}
	
	@Test
	void testReverseString_OneWord() {
		String str = "Java";
		assertEquals("avaJ", task.reverseString(str));
	}
	
	@Test
	void testReverseString_MultipleWord() {
		String str = "Java is easy";
		assertEquals("ysae si avaJ", task.reverseString(str));
	}
	
	@Test
	void testSortingArray() {
		int[] unsorted = {4, 2, 1, 5, 9};
		int[] excepted = {1, 2, 4, 5, 9};
		
		//sort the array
		task.sortingArray(unsorted);
		
		assertArrayEquals(excepted, unsorted);
	}
	
	@Test
	void testSortingArray_PassSortedArray() {
		int[] unsorted = {1, 2, 3, 4, 5};
		int[] excepted = {1, 2, 3, 4, 5};
		
		//sort the array
		task.sortingArray(unsorted);
		
		assertArrayEquals(excepted, unsorted);
	}

}
