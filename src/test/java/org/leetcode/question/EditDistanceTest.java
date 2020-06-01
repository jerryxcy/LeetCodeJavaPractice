package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EditDistanceTest {

	@Test
	public void testMethod() {
		EditDistance ed = new EditDistance();
		assertEquals(1, ed.minDistance("ab", "a"));
		assertEquals(5, ed.minDistance("intention", "execution"));
	}
}
