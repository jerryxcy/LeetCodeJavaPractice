package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UglyNumberIITest {

	@Test
	public void testMethod() {
		UglyNumberII ugly = new UglyNumberII();
		assertEquals(12, ugly.nthUglyNumber(10));
	}
}
