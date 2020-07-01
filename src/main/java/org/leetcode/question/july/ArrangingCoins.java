package org.leetcode.question.july;

public class ArrangingCoins {

	public int arrangeCoins(int n) {
		int levelCount = 1;
		while (n >= levelCount) {
			n -= levelCount;
			levelCount += 1;
		}
		return levelCount - 1;
	}

}
