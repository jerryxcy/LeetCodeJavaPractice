package org.leetcode.question.june;

public class CoinChange2 {

	public int change(int amount, int[] coins) {
		int[][] dp = new int[coins.length+1][amount+1];
		for (int i = 0 ; i < coins.length+1; i++) {
			for (int j = 0 ; j < amount+1; j++) {
				dp[i][j] = 0;
			}
		}
		dp[0][0] = 1;
		for (int i = 1 ; i <= coins.length; i++) {
			dp[i][0] = 1;
			for (int j = 1; j <= amount; j++) {
				dp[i][j] = dp[i-1][j] + (j >= coins[i-1] ? dp[i][j-coins[i-1]]: 0);
			}
		}
		return dp[coins.length][amount];
	}

}
