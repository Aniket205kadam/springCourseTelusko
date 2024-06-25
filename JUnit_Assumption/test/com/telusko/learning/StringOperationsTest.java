package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Assumptions;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringOperationsTest {

	StringOperations so;
	
	@BeforeAll
	void init() {
		so = new StringOperations();
	}
	
	@Test
	void testReverseString() {
		String str = "Java";
		
//		assumeTrue(str.length() > 5);
		
//		assumeFalse(str.equals("Java"));
		
//		Assumptions.assumeTrue(OS.MAC.isCurrentOs());
		
		Assumptions.assumeTrue(JRE.JAVA_19.isCurrentVersion());
		
		assertEquals("avaJ", so.reverseString(str));
	}

}
