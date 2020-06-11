package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortColorsTest {

	@Test
	public void testMethod() {
		SortColors colors = new SortColors();
		int[] input = new int[] {2,0,2,1,1,0};
		colors.sortColors(input);
		assertEquals(true, Arrays.equals(new int[] {0,0,1,1,2,2}, input));
		input = new int[] {1,2,0};
		colors.sortColors(input);
		assertEquals(true, Arrays.equals(new int[] {0,1,2}, input));
	}
}
