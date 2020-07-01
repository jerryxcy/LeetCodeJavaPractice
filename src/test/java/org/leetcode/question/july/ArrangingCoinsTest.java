package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrangingCoinsTest {

	@Test
	public void testMethod() {
		ArrangingCoins coins = new ArrangingCoins();
		assertEquals(2, coins.arrangeCoins(5));
		assertEquals(3, coins.arrangeCoins(8));
	}
}
