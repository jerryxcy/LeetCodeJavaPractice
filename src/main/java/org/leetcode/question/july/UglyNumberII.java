package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.List;

// Ugly Number II
public class UglyNumberII {

	/**
	 * 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
	 * The ugly number could be get from three sequence (x2, x3, x5). 
	 * The nth ugly number is the smallest element compared within three sequence.
	 * (1) "1x2", 2x2, "2x2", 3x2, "3x2", "4x2", 5x2..
	 * (2)  1x3, "1x3", 2x3,  2x3, "2x3",  3x3, "3x3"...
	 * (3)  1x5,  1x5,  1x5, "1x5", 2x5,   2x5,  2x5...
	 * @param n
	 * @return
	 */
	public int nthUglyNumber(int n) {
		List<Integer> result = new ArrayList<>();
		result.add(1);
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		while (result.size() < n) {
			int element2 = result.get(index2) * 2;
			int element3 = result.get(index3) * 3;
			int element5 = result.get(index5) * 5;
			int elementMin = Math.min(element2, Math.min(element3, element5));
			if (element2 == elementMin) {
				index2++;
			}
			if (element3 == elementMin) {
				index3++;
			}
			if (element5 == elementMin) {
				index5++;
			}
			result.add(elementMin);
		}
		return result.get(result.size()-1);
	}

}
