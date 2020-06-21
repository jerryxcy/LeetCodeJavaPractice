package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestDuplicateSubstringTest {

	@Test
	public void testMethod() {
		LongestDuplicateSubstring dup = new LongestDuplicateSubstring();
		assertEquals("ana", dup.longestDupSubstring("banana"));
		assertEquals("", dup.longestDupSubstring("abcd"));
	}
}
