package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddBinaryTest {

	@Test
	public void testMethod() {
		AddBinary add = new AddBinary();
		assertEquals("100", add.addBinary("11", "1"));
		assertEquals("100", add.addBinary("1", "11"));
		assertEquals("10101", add.addBinary("1010", "1011"));
	}
}
