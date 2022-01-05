package org.leetcode.question.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubStringTest {
	@Test
	public void testLongestSubString() {
		LongestSubString solution = new LongestSubString();
		assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
	}
}
