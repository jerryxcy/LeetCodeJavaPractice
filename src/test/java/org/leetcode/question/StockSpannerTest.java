package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StockSpannerTest {
	@Test
	public void testMethod() {
		StockSpanner spanner = new StockSpanner();
		assertEquals(1, spanner.next(100));
		assertEquals(1, spanner.next(80));
		assertEquals(1, spanner.next(60));
		assertEquals(2, spanner.next(70));
		assertEquals(1, spanner.next(60));
		assertEquals(4, spanner.next(75));
		assertEquals(6, spanner.next(85));
	}
}
