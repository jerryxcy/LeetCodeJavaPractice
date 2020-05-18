package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermutationStringTest {
	@Test
	public void testMethod() {
		PermutationString permutation = new PermutationString();
		assertEquals(true, permutation.checkInclusion("ab","eidbaooo"));
		assertEquals(false, permutation.checkInclusion("ab","eidboaoo"));
	}
}
