package org.leetcode.question;

import java.util.ArrayList;
import java.util.List;
//Interval List Intersections
public class IntervalListIntersections {
	
	public int[][] intervalIntersection(int[][] A, int[][] B) {
		List<int[]> result = new ArrayList<>();
		
		int i =0, j=0;
		while (i < A.length && j < B.length) {
			int beginMax = Math.max(A[i][0], B[j][0]);
			int endMin = Math.min(A[i][1], B[j][1]);
			if (beginMax <= endMin) {
				result.add(new int[] {beginMax,endMin});
			}
			
			if (A[i][1] < B[j][1]) {
				i++;
			} else {
				j++;
			}
		}
		return result.toArray(new int[result.size()][]);
	}
}
