package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerfectSquareTest {
	@Test
	public void testMethod() {
		PerfectSquare perfectSquare = new PerfectSquare();
		assertEquals(true, perfectSquare.isPerfectSquare(25));
		assertEquals(true, perfectSquare.isPerfectSquare(16));
		assertEquals(false, perfectSquare.isPerfectSquare(2147483647));
		assertEquals(true, perfectSquare.isPerfectSquare(1));
		assertEquals(false, perfectSquare.isPerfectSquare(2));
	}
}
