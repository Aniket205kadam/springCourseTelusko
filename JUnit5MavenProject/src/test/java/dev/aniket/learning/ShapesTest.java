package dev.aniket.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

class ShapesTest {
	private Shapes shapes = new Shapes();

	@Test
	void test() {
		assertEquals(6, 6);
	}
	
//	@Test
//	void testComputeSquareArea() {
//		assertEquals(576, shapes.computeSquareArea(24),
//				"Area of square calculation is wrong");
//	}
//	
//	@Test
//	void testComputeRecatngleArea() {
//		assertEquals(50, 
//				shapes.computeRectangleArea(10, 5), 
//				"Area of rectangle calculation is wrong");
//		
//	}
//	
//	@Test
//	void testComputeRectangleAreaUsingSupplierInterface() {
//		assertEquals(51, shapes.computeRectangleArea(10, 5),
//				() -> "Area of rectangle calculation is wrong");
//		
//	}
	
//	@Test
//	void testUsingAssertNotEquals() {
//		assertNotEquals(579, shapes.computeSquareArea(24), 
//				"Message for dev if the test is failed");
//	}
	
	@Test
	void testUsingAssertNotEqualsBySupplier() {
		assertNotEquals(576, shapes.computeSquareArea(24),
				() -> "Message for dev if the test is failed");
	}

}
