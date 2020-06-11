package org.leetcode.question.june;

public class SortColors {
	public void sortColors(int[] nums) {
		int red = 0, blue = nums.length-1;
		for (int i = 0 ; i <= blue; i++) {
			if (nums[i] == 0) {
				//red
				int tmp = nums[red];
				nums[red] = nums[i];
				nums[i] = tmp;
				red++;
			} else if (nums[i] == 2) {
				//blue
				int tmp = nums[blue];
				nums[blue] = nums[i];
				nums[i] = tmp;
				blue--;
				//the value swapped wih blue might be swapped again, e.g. it's red.
				i--;
			}
		}
	}
}
