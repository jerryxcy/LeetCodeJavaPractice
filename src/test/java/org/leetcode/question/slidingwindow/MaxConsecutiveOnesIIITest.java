package org.leetcode.question.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveOnesIIITest {

	@Test
	public void testLongestOnes() {
		MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();
		assertEquals(6, solution.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
		assertEquals(10, solution.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
		assertEquals(4, solution.longestOnes(new int[] { 0,0,0,1 }, 4));
	}
}
