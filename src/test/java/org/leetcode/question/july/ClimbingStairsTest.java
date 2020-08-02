package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairsTest {

	@Test
	public void testMethod() {
		ClimbingStairs cl = new ClimbingStairs();
		
		assertEquals(2, cl.climbStairs(2));
		assertEquals(3, cl.climbStairs(3));
	}
}
