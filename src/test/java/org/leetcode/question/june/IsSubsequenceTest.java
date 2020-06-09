package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsSubsequenceTest {


	@Test
	public void testMethod() {
		IsSubsequence seq = new IsSubsequence();
		assertEquals(true, seq.isSubsequence("abc", "ahbgdc"));
		assertEquals(false, seq.isSubsequence("axc", "ahbgdc"));
	}

}
