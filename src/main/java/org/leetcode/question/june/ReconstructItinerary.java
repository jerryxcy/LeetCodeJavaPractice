package org.leetcode.question.june;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItinerary {
	List<String> result = new ArrayList<>();
	
	public List<String> findItinerary(List<List<String>> tickets) {
		Map<String, PriorityQueue<String>> graph = new HashMap<>();
		for(int i = 0 ; i < tickets.size(); i++) {
			if (graph.containsKey(tickets.get(i).get(0))) {
				PriorityQueue<String> set = graph.get(tickets.get(i).get(0));
				set.offer(tickets.get(i).get(1));
			} else {
				PriorityQueue<String> set = new PriorityQueue<>();
				set.offer(tickets.get(i).get(1));
				graph.put(tickets.get(i).get(0), set);
			}
		}
		result = new ArrayList<>();
		dfs(graph, "JFK");
		Collections.reverse(result);
		return result;
	}
	
	public void dfs(Map<String, PriorityQueue<String>> graph, String start) {
		while(graph.containsKey(start) && graph.get(start).size() > 0) {
			String next = graph.get(start).peek();
			graph.get(start).poll();
			dfs(graph, next);
		}
		result.add(start);
	}
}
