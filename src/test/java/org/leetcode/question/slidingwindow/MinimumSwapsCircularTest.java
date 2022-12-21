package org.leetcode.question.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSwapsCircularTest {

	@Test
	public void testMinSwaps() {
		MinimumSwapsCircular solution = new MinimumSwapsCircular();
		assertEquals(1, solution.minSwaps(new int[] {0,1,0,1,1,0,0}));
		assertEquals(2, solution.minSwaps(new int[] {0,1,1,1,0,0,1,1,0}));
		assertEquals(0, solution.minSwaps(new int[] {1,1,0,0,1}));
	}
}
