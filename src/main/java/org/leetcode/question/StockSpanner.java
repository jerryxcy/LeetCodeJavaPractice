package org.leetcode.question;

import java.util.Stack; 



public class StockSpanner {
	public static class Pair {
		public Integer first;
		public Integer second;
		public Pair(Integer first, Integer second) {
			super();
			this.first = first;
			this.second = second;
		}
	}
	Stack<Pair> stack = new Stack<Pair>();
	public StockSpanner() {
	}

	public int next(int price) {
		int count = 1;
		while (!stack.isEmpty() && stack.peek().first <= price) {
			count += stack.peek().second;
			stack.pop();
		}
		stack.push(new Pair(price, count));
		return count;
	}
}
