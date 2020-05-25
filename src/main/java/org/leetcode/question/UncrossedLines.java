package org.leetcode.question;

public class UncrossedLines {

	
	public int maxUncrossedLines(int[] A, int[] B) {
		//dynamic programming
		int[][] dp = new int[A.length][B.length];
		
		for (int i = 0 ; i < A.length; i++) {
			for (int j = 0; j < B.length;  j++) {
				dp[i][j] = 0;
			}
		}
		
		for (int i = 0 ; i < A.length; i++) {
			for (int j = 0; j < B.length;  j++) {
				if (A[i] == B[j]) {
					dp[i][j] =  1;
					if ((i - 1 >= 0) && (j - 1 >= 0)) {
						dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
					}
				} else {
					if ((i - 1 >= 0) && (j - 1 >= 0)) {
						dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]);
					}
					if ((j - 1 >= 0)) {
						dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
					}
					if ((i - 1 >= 0)) {
						dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
					}
				}
			}
		}
		return dp[A.length-1][B.length-1];
	}

}
