package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsertPositionTest {

	@Test
	public void testMethod() {
		InsertPosition po = new InsertPosition();
		assertEquals(2, po.searchInsert(new int[] {1,3,5,6}, 5));
		assertEquals(1, po.searchInsert(new int[] {1,3,5,6}, 2));
		assertEquals(4, po.searchInsert(new int[] {1,3,5,6}, 7));
		assertEquals(0, po.searchInsert(new int[] {1,3,5,6}, 0));
	}
}
