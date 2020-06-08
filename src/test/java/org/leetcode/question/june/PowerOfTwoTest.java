package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerOfTwoTest {

	@Test
	public void testMethod() {
		PowerOfTwo test = new PowerOfTwo();
		assertEquals(true, test.isPowerOfTwo(8));
		assertEquals(false, test.isPowerOfTwo(6));
		assertEquals(false, test.isPowerOfTwo(0));
		assertEquals(true, test.isPowerOfTwo(1));
	}
}
