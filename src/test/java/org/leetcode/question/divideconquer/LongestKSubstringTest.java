package org.leetcode.question.divideconquer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestKSubstringTest {

	@Test
	public void testMethod() {
		LongestKSubstring algo = new LongestKSubstring();
		assertEquals(3, algo.longestSubstring("aaabb", 3));
		assertEquals(5, algo.longestSubstring("ababbc", 2));
	}
}
