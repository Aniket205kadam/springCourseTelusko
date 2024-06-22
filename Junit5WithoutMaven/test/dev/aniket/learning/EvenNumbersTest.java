package dev.aniket.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class EvenNumbersTest {

	@Test
	void test() {
		EvenNumbers even = new EvenNumbers();
		
		assertEquals(Arrays.asList(2, 4, 6), 
				even.sortEvenNumber(new int[]{1, 2, 3 , 4, 5, 6}));
		
	}

}
