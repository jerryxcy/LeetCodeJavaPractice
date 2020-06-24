package org.leetcode.question.june;

public class UniqueBinarySearchTrees {

	public int numTrees(int n) {
		//Catalan number
		if (n == 0) return 1;
		int[] dp = new int[n+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 0;
		}
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i-j-1];
			}
		}
		return dp[n];
	}

}
