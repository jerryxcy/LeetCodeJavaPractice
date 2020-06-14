package org.leetcode.question.june;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Cheapest Flights Within K Stops
public class CheapestFlights {
	private int finalPrice = Integer.MAX_VALUE;
	
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		finalPrice = Integer.MAX_VALUE;
		Map<Integer, Map<Integer, Integer>> flightsPrice = new HashMap<>();
		for (int i = 0 ; i < flights.length; i++) {
			Map<Integer, Integer> targetPrice = new HashMap<>();
			if (flightsPrice.containsKey(flights[i][0])) {
				targetPrice = flightsPrice.get(flights[i][0]);
			} 
			targetPrice.put(flights[i][1], flights[i][2]);
			flightsPrice.put(flights[i][0], targetPrice);
		}
		
		Set<Integer> visited = new HashSet<>();
		visited.add(src);
		dfs(flightsPrice, src, dst, K, visited, 0);
		return Integer.compare(Integer.valueOf(Integer.MAX_VALUE), finalPrice) == 0 ? -1: finalPrice;
	}

	public void dfs(Map<Integer, Map<Integer, Integer>> flightsPrice, int cur, int dst, int K, Set<Integer> visited,
			Integer currentPrice) {
		if (cur == dst) {
			finalPrice = currentPrice;
			return;
		}
		if (K < 0) {
			return;
		}
		if (flightsPrice.containsKey(cur)) {
			for (Map.Entry<Integer, Integer> targetPrice : flightsPrice.get(cur).entrySet()) {
				if (visited.contains(targetPrice.getKey()) || currentPrice + targetPrice.getValue() > finalPrice) {
					continue;
				}
				visited.add(targetPrice.getKey());
				dfs(flightsPrice, targetPrice.getKey(), dst, K-1, visited,  currentPrice + targetPrice.getValue());
				visited.remove(targetPrice.getKey());
			}
		}
	}
}
