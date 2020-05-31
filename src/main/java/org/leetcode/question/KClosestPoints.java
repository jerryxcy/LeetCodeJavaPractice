package org.leetcode.question;

import java.util.Comparator;
import java.util.PriorityQueue;

//K Closest Points to Origin
public class KClosestPoints {

	public int[][] kClosest(int[][] points, int K) {
		//use priority queue
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(K+1, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return (o2[0]*o2[0]+o2[1]*o2[1]) - (o1[0]*o1[0]+o1[1]*o1[1]);
			}
		});
		for (int i = 0 ; i < points.length; i++) {
			pq.add(points[i]);
			if (pq.size() > K) {
				pq.poll();
			}
		}
		int[][] result = new int[pq.size()][2];
		int i = 0;
		while (pq.size() > 0){
			result[i] = pq.poll();
			i++;
		}
		return result;
	}
}
