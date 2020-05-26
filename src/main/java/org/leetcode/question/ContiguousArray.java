package org.leetcode.question;

import java.util.HashMap;

//Contiguous Array
public class ContiguousArray {

	public int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> counts = new HashMap<>();
		//for the case: {0,1}, we should put the key 0 first into the map.
		counts.put(0, -1);
		int maxLen = 0;
		
		int count = 0;
		for (int i = 0 ; i < nums.length; i++) {
			if (nums[i] == 0) {
				count += -1;
			} else {
				count += 1;
				
			}
			
			if (counts.containsKey(count)) {
				//when having the same count, it means there are the same number of 0 and 1
				//between the index
				maxLen = Math.max(maxLen, i - counts.get(count));
			} else {
				counts.put(count, i);
			}
		}
		return maxLen;
	}
}
