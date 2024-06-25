package com.telusko.learning;

import java.util.Arrays;

public class StringOperations {
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
}
