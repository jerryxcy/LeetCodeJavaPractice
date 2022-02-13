package org.leetcode.question.slidingwindow;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 220. Contains Duplicate III
 * https://leetcode.com/problems/contains-duplicate-iii/
 *
 */
public class ContainsDuplicateIII {
	
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (k <= 0 || t < 0) {
			return false;
		}
		Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		if (t == 0 && numsSet.size() == nums.length) {
			return false;
		}
		
		//use tree to search
		TreeSet<Long> treeSet = new TreeSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (i > k) {
				treeSet.remove(Long.valueOf(nums[i-k-1]));
			}
			Long floor = treeSet.floor(Long.valueOf(nums[i]));
			Long ceiling = treeSet.ceiling(Long.valueOf(nums[i]));
			if (floor != null && Math.abs(nums[i] - floor) <= t) {
				return true;
			}
			if (ceiling != null && Math.abs(nums[i] - ceiling) <= t) {
				return true;
			}
			treeSet.add(Long.valueOf(nums[i]));
		}
		return false;

	}
}
