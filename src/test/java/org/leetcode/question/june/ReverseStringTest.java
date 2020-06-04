package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testMethod() {
		ReverseString r = new ReverseString();
		char[] sample1 = new char[] {'h', 'e', 'l', 'l', 'o'};
		r.reverseString(sample1);
		assertEquals("olleh", String.valueOf(sample1));
		char[] sample2 = new char[] {'h', 'a', 'n', 'n', 'a', 'b'};
		r.reverseString(sample2);
		assertEquals("bannah", String.valueOf(sample2));
	}
}
