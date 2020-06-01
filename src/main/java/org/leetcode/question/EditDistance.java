package org.leetcode.question;

//Edit Distance
public class EditDistance {

	public int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		int[][] dp = new int[len1+1][len2+1];
		for (int i = 0 ; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				dp[i][j] = -1;
			}
		}
		return calMinDistance(word1, word2, dp, len1, len2);
	}
	
	public int calMinDistance(String word1, String word2, int[][] dp, int len1, int len2) {
		if (len1 == 0) {
			return len2;
		}
		if (len2 == 0) {
			return len1;
		}
		if (dp[len1][len2] >= 0) {
			return dp[len1][len2];
		}
		int ans = -1;
		if (word1.charAt(len1-1) == word2.charAt(len2-1)) {
			//equals
			ans = calMinDistance(word1, word2, dp, len1-1, len2-1);
		} else {
			ans = Math.min(calMinDistance(word1, word2, dp, len1-1, len2-1), 
					Math.min(calMinDistance(word1, word2, dp, len1-1, len2), 
							calMinDistance(word1, word2, dp, len1, len2-1))) + 1;
		}
		dp[len1][len2] = ans;
		return dp[len1][len2];
	}
}
