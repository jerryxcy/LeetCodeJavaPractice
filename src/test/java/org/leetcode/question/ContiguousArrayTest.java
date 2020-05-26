package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContiguousArrayTest {

	@Test
	public void testMethod() {
		ContiguousArray ca = new ContiguousArray();
		assertEquals(4 , ca.findMaxLength(new int[] {1,0,1,0,1}));
	}
}
