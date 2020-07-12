package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Subsets
public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int size = result.size();
			
			List<List<Integer>> temp = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				List<Integer> newItem = new ArrayList<>(result.get(j));
				newItem.add(nums[i]);
				temp.add(newItem);
			}
			result.addAll(temp);
		}
		return result;
	}

}
