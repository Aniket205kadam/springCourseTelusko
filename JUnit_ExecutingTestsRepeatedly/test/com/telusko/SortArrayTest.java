package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class SortArrayTest {

	@RepeatedTest(3)
	void testSortArrayUsingMemory(RepetitionInfo info) {
		SortArray sortArray = new SortArray();
		
		int[] unsorted = {5, 3, 2, 1};
		
		int repetitionNumber = info.getCurrentRepetition();
		
		if (repetitionNumber == 1) {
			System.out.println("1st repetition");
			assertTimeout(Duration.ofMillis(100), 
				() -> sortArray.sortArrayUsingMemory(unsorted));
		}
		else if (repetitionNumber == 2) {
			System.out.println("2nd repetition");
			assertTimeout(Duration.ofMillis(50), 
					() -> sortArray.sortArrayUsingMemory(unsorted));
		} else {
			System.out.println("3rd repetition");
			assertTimeout(Duration.ofMillis(10), 
					() -> sortArray.sortArrayUsingMemory(unsorted));
		}
	}

}
