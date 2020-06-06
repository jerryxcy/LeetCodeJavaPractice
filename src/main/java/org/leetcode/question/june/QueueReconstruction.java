package org.leetcode.question.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruction {

	public int[][] reconstructQueue(int[][] people) {
		//sort by highest people, and then by asc order
		Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] - o2[0] == 0) {
					return o1[1] - o2[1];
				}
				return o2[0] - o1[0];
			}
			
		});
		
		ArrayList<int[]> result = new ArrayList<int[]>();
		for(int i = 0 ; i < people.length; i++) {
			 int[] target = people[i];
			result.add(people[i][1], target);
		}
		int[][] resultArr = new int[people.length][2];
		for(int i = 0 ; i < people.length; i++) {
			resultArr[i] = result.get(i);
		}
		return resultArr;
	}
	
}
