package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HIndexIITest {

	@Test
	public void testMethod() {
		HIndexII hIndex = new HIndexII();
		assertEquals(3, hIndex.hIndex(new int[] {0,1,3,5,6}));
		assertEquals(1, hIndex.hIndex(new int[] {100}));
		
	}
}
