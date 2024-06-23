package com.learing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingArrayTest {

	@Test(timeout = 10)
	public void test() {
		SortingArray<Integer> sortingArray = new SortingArray<>();
		
		Integer[] unsortedArray = {3, 2, 1};
		
		sortingArray.sort(unsortedArray);
	}

}
