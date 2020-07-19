package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		//build indegree and graph
		List<Integer> indegrees = new ArrayList<>();
		List<List<Integer>> graph = new ArrayList<>();
		for(int i = 0 ; i < numCourses; i++) {
			graph.add(new ArrayList<Integer>());
			indegrees.add(0);
		}
		for(int i =0; i < prerequisites.length; i++) {
			graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
			indegrees.set(prerequisites[i][0], indegrees.get(prerequisites[i][0])+1);
			//IntStream.range(0, indegrees.size()).mapToObj(j -> j + ":"+ indegrees.get(j)).collect(Collectors.toList()).forEach(System.out::println);
		}
		
		//add 0 indegree into queue
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0 ; i < numCourses; i++) {
			if (indegrees.get(i) == 0) {
				queue.offer(i);
			}
		}
		
		List<Integer> result = new ArrayList<>();
		while (!queue.isEmpty()) {
			Integer element = queue.peek();
			result.add(element);
			queue.poll();
			for (Integer neighbor : graph.get(element)) {
				indegrees.set(neighbor, indegrees.get(neighbor)-1);
				if (indegrees.get(neighbor) == 0) {
					queue.offer(neighbor);
				}
			}
		}
		if (result.size() != numCourses) {
			result.clear();
		}
		return result.stream().mapToInt(i -> i).toArray();
	}

}
