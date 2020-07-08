package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ThreeSumtTest {

	@Test
	public void testMethod() {
		ThreeSum sum = new ThreeSum();
		List<List<Integer>> result = sum.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
		for (int i = 0; i < result.size(); i++) {
			List<Integer> set = result.get(i);
			if (set.contains(0)) {
				assertEquals(true, Arrays.deepEquals(set.toArray(new Integer[set.size()]), new Integer[] {-1, 0, 1}));
			} else if (set.contains(2)) {
				assertEquals(true, Arrays.deepEquals(set.toArray(new Integer[set.size()]), new Integer[] {-1, -1, 2}));
			}
		}
	}
}
