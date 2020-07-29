package org.leetcode.question.july;

//Best Time to Buy and Sell Stock with Cooldown
public class BuyAndSellStock {
	public int maxProfit(int[] prices) {
		int buy = Integer.MIN_VALUE;
		int preBuy = 0;
		int sell = 0, preSell = 0;
		for (int price : prices) {
			preBuy = buy;
			buy = Math.max(preSell - price, preBuy);
			preSell = sell;
			sell = Math.max(preBuy + price, preSell);
		}
		return sell;
	}
}
