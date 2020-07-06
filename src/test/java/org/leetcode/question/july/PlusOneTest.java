package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PlusOneTest {


	@Test
	public void testMethod() {
		PlusOne one = new PlusOne();
		assertEquals(true, Arrays.equals(new int[] {1, 2, 4}, one.plusOne(new int[] {1, 2, 3}))); 
		assertEquals(true, Arrays.equals(new int[] {1, 3, 0}, one.plusOne(new int[] {1, 2, 9}))); 
		assertEquals(true, Arrays.equals(new int[] {1, 0, 0, 0}, one.plusOne(new int[] {9, 9, 9}))); 
	}

}
