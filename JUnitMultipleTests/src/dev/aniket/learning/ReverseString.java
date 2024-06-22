package dev.aniket.learning;


public class ReverseString {
	//Java - > avaJ
	public String reverse(String str) {
		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length-1;
		
		while (start < end) {
			//swap charecter at the start and end position
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			//move the pointer towards the each other
			start++;
			end--;
		}
		
		return new String(chars);
	}
}