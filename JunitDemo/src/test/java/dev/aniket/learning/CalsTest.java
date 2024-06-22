package dev.aniket.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalsTest {

	@Test
	public void test() {
		Cals cals = new Cals();
		int actualResult = cals.divide(10, 5);
		int exceptedResult = 2;
		assertEquals(exceptedResult, actualResult);
	}

}
