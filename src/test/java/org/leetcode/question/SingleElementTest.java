package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleElementTest {
	@Test
	public void testSomeLibraryMethod() {
		SingleElement singleElement = new SingleElement();
		assertEquals(2, singleElement.singleNonDuplicate(new int[] { 1, 1, 2 }));
		assertEquals(2, singleElement.singleNonDuplicate(new int[] { 1, 1, 2, 3, 3}));
		assertEquals(1, singleElement.singleNonDuplicate(new int[] { 1, 2, 2, 3, 3}));
	}
}
