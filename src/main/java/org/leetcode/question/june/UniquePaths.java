package org.leetcode.question.june;

//Question - Unique Paths

public class UniquePaths {
	public int uniquePaths(int m, int n) {
		//dynamic programming
		//dp[i][j] = dp[i-1][j] + dp[i][j-1]
		//here, use 1-demension array to save memeroy
		int[] dp = new int[n];
		for (int i = 0 ; i < n; i++) {
			dp[i] = 1;
		}
		for (int i = 1 ; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[j] += dp[j-1];
			}
		}
		return dp[n-1];
	}
}
