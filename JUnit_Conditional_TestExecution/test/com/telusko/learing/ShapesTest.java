package com.telusko.learing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import com.telusko.learning.Shapes;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {

	Shapes shape = new Shapes();
	
	
	@BeforeAll
	void beforeAll() {
		System.out.println("Before all test");
	}

	@Test
//	@EnabledOnJre(JRE.JAVA_11)
	@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
	void testComputeSquareArea() {
		System.out.println("For square test is executed");
		assertEquals(16, shape.computeSquareArea(4));
	}
	
	
	@Test
//	@EnabledOnOs(OS.WINDOWS)
//	@EnabledOnOs(OS.MAC)
	void testComputeCircleArea() {
		System.out.println("For circle test is executed");
		assertEquals(314, shape.computeCircleArea(10));
	}

}
