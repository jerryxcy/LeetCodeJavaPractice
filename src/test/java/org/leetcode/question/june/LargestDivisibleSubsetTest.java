package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LargestDivisibleSubsetTest {

	@Test
	public void testMethod() {
		LargestDivisibleSubset test = new LargestDivisibleSubset();
		int[] nums = new int[] {1,2,4,8};
		List<Integer> result = test.largestDivisibleSubset(nums);
		System.out.println(result.toString());
		assertEquals(true, Arrays.equals(result.stream().mapToInt(i -> i).toArray(), new int[] {1,2,4,8}));
	}
}
