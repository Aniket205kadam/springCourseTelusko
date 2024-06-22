package com.learing;


import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testSort_Exception() {
		SortingArray sa = new SortingArray();
		
//		int[] unsortedArray = {2, 1, 4};
		
//		try {
//			int[] unsortedArray = null;
//			int[] sortedArray = sa.sort(unsortedArray);
//			
//		} 
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
		
		int[] unsortedArray = null;
		assertThrows(NullPointerException.class, () -> sa.sort(unsortedArray));
		
	}

}
