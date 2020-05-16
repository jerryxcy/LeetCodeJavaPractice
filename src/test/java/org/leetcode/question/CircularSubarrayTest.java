package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircularSubarrayTest {

	@Test
	public void testMethod() {
		CircularSubarray sub = new CircularSubarray();
		assertEquals(3, sub.maxSubarraySumCircular(new int[] {1,-2,3,-2}));
		assertEquals(10, sub.maxSubarraySumCircular(new int[] {5,-3,5}));
		assertEquals(4, sub.maxSubarraySumCircular(new int[] {3,-1,2,-1}));
		assertEquals(3, sub.maxSubarraySumCircular(new int[] {3,-2,2,-3}));
		assertEquals(-1, sub.maxSubarraySumCircular(new int[] {-2,-3,-1}));
	}
}
