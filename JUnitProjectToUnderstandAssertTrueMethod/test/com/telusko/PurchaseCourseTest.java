package com.telusko;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.telusko.service.PurchaseCourse;

class PurchaseCourseTest {

	@Test
	void testProceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
//		assertTrue(status);
//		assertFalse(status, "Its not works, check your logic");
		assertFalse(status, () -> "Its not works, check your logic");
	}

}
