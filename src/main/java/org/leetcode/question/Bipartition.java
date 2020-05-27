package org.leetcode.question;

import java.util.ArrayList;
import java.util.List;

//Possible Bipartition
public class Bipartition {
	public boolean possibleBipartition(int N, int[][] dislikes) {
		//build the two dimension relationship
		List<List<Integer>> all = new ArrayList<>();
		for (int i = 0 ; i < N; i++) {
			all.add(new ArrayList<>());
		}
		for (int i = 0 ; i < dislikes.length; i++) {
			int x = dislikes[i][0] - 1;
			int y = dislikes[i][1] - 1;
			all.get(x).add(y);
			all.get(y).add(x);
		}
		
		//graph coloring. initial the color as 0 first.
		int[] groupResult = new int[N];
		for (int i = 0 ; i < N; i++) {
			groupResult[i] = 0;
		}
		
		for (int i = 0 ; i < N; i++) {
			if (groupResult[i] != 0) {
				//already colored
				continue;
			}
			//use dfs to color
			if (!dfs(groupResult, all, i, 1)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean dfs(int[] groupResult, List<List<Integer>> all, int i, int groupID) {
		if (groupResult[i] != 0) {
			//check the color is the same or not
			return groupResult[i] == groupID;
		}
		//color
		groupResult[i] = groupID;
		//color neighbors
		List<Integer> dislikes = all.get(i);
		//another color
		int anotherGroupID = -1 * groupID;
		for (Integer dislike : dislikes) {
			//recursive color
			if (!dfs(groupResult, all, dislike, anotherGroupID)) {
				return false;
			}
		}
		return true;
	}
}
