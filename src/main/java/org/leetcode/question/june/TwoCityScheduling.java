package org.leetcode.question.june;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

	public int twoCitySchedCost(int[][] costs) {
		
		int sum = 0;
		for (int i = 0 ; i < costs.length; i++) {
			sum += costs[i][0];
		}
		//sort the order by the difference of moving from city A to cityB
		Arrays.sort(costs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				int diff1 = o1[1] - o1[0];
				int diff2 = o2[1] - o2[0];
				return diff1 - diff2;
			}
			
		});
		for (int i = 0; i < costs.length/2; i++) {
			sum += (costs[i][1] - costs[i][0]);
		}
		return sum;
	}
}
