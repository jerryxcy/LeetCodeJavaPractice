package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		if (nums.length == 0 || nums[0] > 0 || nums[nums.length-1] < 0) return result;
		for (int i = 0 ; i < nums.length - 2; i++) {
			if (nums[i] > 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			int target = 0 - nums[i];
			int start = i + 1;
			int end = nums.length - 1;
			while (start < end) {
				if (nums[start] + nums[end] == target) {
					List<Integer> set = new ArrayList<>();
					set.add(nums[i]);
					set.add(nums[start]);
					set.add(nums[end]);
					result.add(set);
					while (start < end && nums[start] == nums[start+1]) start++;
					while (start < end && nums[end] == nums[end-1]) end--;
					start++;
					end--;
				} else if (nums[start] + nums[end] < target) {
					start++;
				} else {
					end--;
				}
			}
		}
		return result;
	}

}
