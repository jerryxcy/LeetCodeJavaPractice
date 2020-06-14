package org.leetcode.question.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Largest Divisible Subset
public class LargestDivisibleSubset {

	public List<Integer> largestDivisibleSubset(int[] nums) {
		//sort the array first
		Arrays.sort(nums);
		int[] dp = new int[nums.length];
		int[] index = new int[nums.length];
		//the least subset should be 1 of each element.
		Arrays.fill(dp, 1);
		Arrays.fill(index, -1);
		
		int maxDp = 0;
		int maxIndex = -1;
		for (int i = 0 ; i < nums.length; i++) {
			for (int j = i-1; j >=0; j--) {
				if (nums[i] % nums[j] == 0 && dp[i] < dp[j]+1) {
					dp[i] = dp[j] + 1;
					index[i] = j;
				}
			}
			if (maxDp < dp[i]) {
				maxDp = dp[i];
				maxIndex = i;
			}
		}
		
		List<Integer> result = new ArrayList<Integer>();
		while (maxIndex != -1) {
			result.add(0, nums[maxIndex]);
			maxIndex = index[maxIndex];
		}
		return result;
	}

}
