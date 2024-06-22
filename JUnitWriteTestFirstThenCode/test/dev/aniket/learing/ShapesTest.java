package dev.aniket.learing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dev.aniket.learning.Shapes;

class ShapesTest {
	private Shapes shapes = new Shapes();

	@Test
	void testComputeSquareArea() {
		assertEquals(576, shapes.computeSquareArea(24),
				"Area of square calculation is wrong");
	}
	
	@Test
	void testComputeRectangleArea() {
		assertEquals(50, 
				shapes.computeRectangleArea(10, 5), 
				"Area of rectangle calculation is wrong");
	}

}
