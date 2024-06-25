package com.telusko;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArray {
	public int[] sortArrayUsingMemory(int[] array) {
	    int[] sortedArray = new int[array.length];
	    System.arraycopy(array, 0, sortedArray, 0, array.length); // Copy the original array to avoid modifying it directly

	    for (int i = 0; i < sortedArray.length - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < sortedArray.length; j++) {
	            if (sortedArray[j] < sortedArray[minIndex]) {
	                minIndex = j;
	            }
	        }
	        // Swap the found minimum element with the first element
	        int temp = sortedArray[minIndex];
	        sortedArray[minIndex] = sortedArray[i];
	        sortedArray[i] = temp;
	    }
	    return sortedArray;
	}
} 

