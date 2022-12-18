package org.leetcode.question.slidingwindow;

/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 * 1004. Max Consecutive Ones III
 *
 */
public class MaxConsecutiveOnesIII {
	public int longestOnes(int[] nums, int k) {
        //sliding window
        int left = 0;
        int right = 0;
        int result = 0;
        int used_k = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                used_k++;
            } 
            while (used_k > k) {
                if (nums[left] == 0) {
                    used_k--;
                }
                left++;
            }
            right++;
            result = Math.max(result, (right - left));
            
        }
        return result;
    }
}
