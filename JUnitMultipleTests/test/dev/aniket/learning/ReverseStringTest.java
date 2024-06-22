package dev.aniket.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	private ReverseString rs = new ReverseString();

	@Test
	void testReverseString_OneWord() {
//		Java => avaJ
		assertEquals("avaJ", rs.reverse("Java"));
	}
	
	@Test
	void testReverseString_MultipleWords() {	
//		Java is easy => ysae si avaJ
		assertEquals("ysae si avaJ", rs.reverse("Java is easy"));
	}

}
