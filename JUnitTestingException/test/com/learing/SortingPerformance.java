package com.learing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortingPerformance {

	@Test
	void testSort_timeout() {
		SortingArray sortingArray = new SortingArray();
		
		int[] unsortedArray = {3, 2, 1};
		
		assertTimeout(Duration.ofMillis(13), 
				() -> sortingArray.sort(unsortedArray));
	}

}
