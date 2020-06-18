package org.leetcode.question.june;

public class HIndexII {

	public int hIndex(int[] citations) {

		int left = 0;
		int right = citations.length;
		while (left < right) {
			int mid = (left + right) / 2;
			int h = citations.length - mid;
			if (citations[mid] >= h) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return citations.length - left;		
	}

}
