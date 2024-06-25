package com.telusko.learning;

import java.util.Arrays;

public class MultipleTask {
	public String reverseString(String str) {
		char[] strs = str.toCharArray();
		int start = 0;
		int end = strs.length-1;
		
		while (start < end) {
			//swap 
			char temp = strs[start];
			strs[start] = strs[end];
			strs[end] = temp;
			
			//change the pointer values
			start++;
			end--;
		}
		return new String(strs);
	}
	
	public void sortingArray(int[] arr) {
		int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) break;
        }
	}
}
