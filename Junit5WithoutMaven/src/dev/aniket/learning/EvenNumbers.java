package dev.aniket.learning;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
	public List<Integer> sortEvenNumber(int[] nums) {
		List<Integer> evens = new ArrayList<>();
		for (int num : nums) {
			if (num%2==0) {
				evens.add(num);
			}
		}
		return evens;
	}
}
