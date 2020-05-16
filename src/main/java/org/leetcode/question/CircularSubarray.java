package org.leetcode.question;

//Maximum Sum Circular Subarray
public class CircularSubarray {
	
	public int maxSubarraySumCircular(int[] A) {
		int total = 0;
		int maxSum = Integer.MIN_VALUE;
		int currentMax = 0;
		int minSum = Integer.MAX_VALUE;
		int currentMin = 0;
		for (int i = 0 ; i < A.length; i++) {
			//for case1
			currentMax = Math.max(currentMax + A[i], A[i]);
			maxSum = Math.max(maxSum, currentMax);
			//for case2. find total and minSum
			currentMin = Math.min(currentMin + A[i], A[i]);
			minSum = Math.min(minSum, currentMin);
			total += A[i];
		}
	
		return maxSum > 0? Math.max(maxSum, total-minSum):maxSum;
	}
}
