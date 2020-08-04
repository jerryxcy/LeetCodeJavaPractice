package org.leetcode.question.august;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerOfFourTest {

	@Test
	public void testMethod() {
		 PowerOfFour four = new PowerOfFour();
		 assertEquals(true, four.isPowerOfFour(4));
		 assertEquals(false, four.isPowerOfFour(3));
	}
}
