package org.leetcode.question.october;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Pattern132Test {

	@Test
	public void testPattern132() {
		Pattern132 pattern = new Pattern132();
		
		assertEquals(false, pattern.find132pattern(new int[] {1,2,3,4}));
		assertEquals(true, pattern.find132pattern(new int[] {3,1,4,2}));
		assertEquals(true, pattern.find132pattern(new int[] {-1,3,2,0}));
	}
}
