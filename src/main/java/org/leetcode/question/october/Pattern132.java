package org.leetcode.question.october;

//132 Pattern
public class Pattern132 {

	public boolean find132pattern(int[] nums) {
		int len = nums.length;
		int minValue = Integer.MAX_VALUE;
		for (int j = 0; j < len; j++) {
			minValue = Math.min(minValue, nums[j]);
			if (minValue == nums[j]) {
				continue;
			}
			for (int k = len - 1; k > j; k--) {
				if (minValue < nums[k] && nums[j] > nums[k])
					return true;
			}
		}
		return false;
	}
}
