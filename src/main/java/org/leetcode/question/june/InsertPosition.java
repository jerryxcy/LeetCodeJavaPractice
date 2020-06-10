package org.leetcode.question.june;

public class InsertPosition {
	public int searchInsert(int[] nums, int target) {
		int i = 0;
		int j = nums.length-1;
		while(i <= j) {
			int mid = (i+j)/2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > target) {
				j = mid-1;
			} else {
				i = mid+1;
			}
		}
		return i;
	}
	
	public int searchInsertSolution2(int[] nums, int target) {
		int index = 0;
		for (int i = 0 ; i < nums.length; i++) {
			if (nums[i] == target) {
				index = i;
				break;
			} else if (nums[i] > target) {
				index = i;
				break;
			} else if (nums[i] < target && i == nums.length-1) {
				index = nums.length;
			}
		}
		return index;
	}
}
