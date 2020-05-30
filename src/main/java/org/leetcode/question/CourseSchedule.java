package org.leetcode.question;

import java.util.ArrayList;
import java.util.List;

//Course Schedule
public class CourseSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		List<List<Integer>> graph = new ArrayList<>();
		for(int i = 0 ; i < numCourses; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i =0; i < prerequisites.length; i++) {
			graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}
		
		//topology sorting
		//0: unknown, 1: visiting, 2: visited
		int[] nodeStatus = new int[numCourses];
		for(int i = 0 ; i < nodeStatus.length; i++) {
			nodeStatus[i] = 0;
		}
		
		for(int i = 0 ; i < numCourses; i++) {
			if (nodeStatus[i] == 0) {
				if (dfs(nodeStatus, graph, i)) {
					//true means there is a cycle
					return false;
				}
			}
			
		}
		return true;
	}
	
	public boolean dfs(int[] nodeStatus, List<List<Integer>> graph, int i) {
		if (nodeStatus[i] == 2) {
			//visited
			return false;
		}
		if (nodeStatus[i] == 1) {
			//there is a cycle
			return true;
		}
		//mark as visiting
		nodeStatus[i] = 1;
		//visiting neighbors
		for (int j = 0 ; j < graph.get(i).size(); j++) {
			if (dfs(nodeStatus, graph, graph.get(i).get(j))) {
				return true;
			}
		}
		nodeStatus[i] = 2;
		return false;
	}
}
