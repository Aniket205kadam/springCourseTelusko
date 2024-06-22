package dev.aniket.learning;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
//		ReverseString reverseString = new ReverseString();
		assertEquals("avaJ", new ReverseString().reverse("Java"));
	}

}
