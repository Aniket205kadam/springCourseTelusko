package com.learing;

import java.util.Arrays;

public class SortingArray<T> {
	public T[] sort(T[] array) {
		try {
			Thread.sleep(12);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Arrays.sort(array);
		return array;
	}
}
