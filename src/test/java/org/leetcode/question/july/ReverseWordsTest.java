package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsTest {

	@Test
	public void testMethod() {
		ReverseWords reverse = new ReverseWords();
		assertEquals("blue is sky the", reverse.reverseWords("the sky is blue"));
		assertEquals("world! hello", reverse.reverseWords("  hello world!  "));
		assertEquals("example good a", reverse.reverseWords("a good   example"));
	}
}
