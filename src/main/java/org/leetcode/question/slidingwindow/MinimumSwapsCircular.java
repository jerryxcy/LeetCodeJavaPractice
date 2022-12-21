package org.leetcode.question.slidingwindow;

/**
 * 2134. Minimum Swaps to Group All 1's Together II
 * https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii
 */
public class MinimumSwapsCircular {
	
	public int minSwaps(int[] nums) {
        //find how many 1's
        int total1Count = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == 1) {
                total1Count += 1;
            }
        }
        //find the minimum 0's count in the interval of total1Count length
        //it's the minumum number of swaps
        int zeros = 0;
        int result = total1Count;
        for (int i = 0 ; i < nums.length + total1Count; i++) {
            if (nums[i % nums.length] == 0) {
                zeros++;
            }
            if (i >= total1Count - 1) {
                result = Math.min(result, zeros);
                if (nums[(i+1-total1Count)% nums.length] == 0) {
                    zeros--;
                }
            }
        }
        return result;
    }
}
