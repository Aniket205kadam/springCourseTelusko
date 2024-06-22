package com.telsuko;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AssertArrayEquals {

	@Test
	void test() {
		int[] expected = {2, 4, 6, 8};
		int[] actual = {2, 6, 4, 8};
		
		Arrays.sort(actual); //2, 4, 6, 8
		
		assertArrayEquals(expected, actual);
	}

}
