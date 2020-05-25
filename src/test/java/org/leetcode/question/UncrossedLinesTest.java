package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UncrossedLinesTest {

	@Test
	public void testMethod() {
		UncrossedLines lines = new UncrossedLines();
		assertEquals(2, lines.maxUncrossedLines(new int[] {1,4,2}, new int[] {1,2,4}));
		assertEquals(3, lines.maxUncrossedLines(new int[] {2,5,1,2,5}, new int[] {10,5,2,1,5,2}));
		assertEquals(2, lines.maxUncrossedLines(new int[] {1,3,7,1,7,5}, new int[] {1,9,2,5,1}));
	}
	


}
