package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChange2Test {

	@Test
	public void testMethod() {
		CoinChange2 change2 = new CoinChange2();
		assertEquals(4, change2.change(5, new int[] {1, 2, 5}));
		assertEquals(0, change2.change(3, new int[] {2}));
		assertEquals(1, change2.change(10, new int[] {10}));
	}
}
