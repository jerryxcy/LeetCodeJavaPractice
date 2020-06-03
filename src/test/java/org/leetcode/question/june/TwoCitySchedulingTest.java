package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoCitySchedulingTest {

	@Test
	public void testMethod() {
		TwoCityScheduling twocity = new TwoCityScheduling();
		assertEquals(110, twocity.twoCitySchedCost(new int[][] {{10,20},{30,200},{400,50},{30,20}}));
	}
}
