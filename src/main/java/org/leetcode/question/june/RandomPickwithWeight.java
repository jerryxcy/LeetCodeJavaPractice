package org.leetcode.question.june;

import java.util.Random;

public class RandomPickwithWeight {

	int[] sum;
	
	public RandomPickwithWeight(int[] w) {
		sum = new int[w.length];
		for (int i = 0 ; i < w.length; i++) {
			sum[i] = w[i];
			
		}
		for (int i = 1 ; i < w.length; i++) {
			sum[i] = sum[i-1] + sum[i];	
		}
	}

	public int pickIndex() {
		Random ran = new Random();
		int randint = ran.nextInt(sum[sum.length-1]);
		int left = 0;
		int right = sum.length-1;
		while (left < right) {
			int mid = left + (right-left) / 2;
			if (sum[mid] <= randint) {
				left = mid+1;
			} else {
				right = mid;
			}
		}
		return right;
	}
}
