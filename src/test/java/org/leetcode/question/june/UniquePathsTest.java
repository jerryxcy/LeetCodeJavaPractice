package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniquePathsTest {
	@Test
	public void testMethod() {
		UniquePaths path = new UniquePaths();
		assertEquals(3, path.uniquePaths(3, 2));
		assertEquals(28, path.uniquePaths(7, 3));
	}
}
