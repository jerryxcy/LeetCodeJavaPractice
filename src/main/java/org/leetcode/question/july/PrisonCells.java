package org.leetcode.question.july;

import java.util.HashMap;
import java.util.Map;

public class PrisonCells {

	public int[] prisonAfterNDays(int[] cells, int N) {
		Map<Integer, Integer> seen = new HashMap<>();
		
		//use binary to represent to state
		int state = 0;
		for (int i = 0 ; i < cells.length; i++) {
			if (cells[i] > 0) {
				state ^= (1 << i);
			}
		}
		
		while (N > 0) {
			
			if (seen.containsKey(state)) {
				N %= (seen.get(state) - N);
			}
			seen.put(state, N);
			if (N >= 1) {
				N--;
				state = nextDay(state);
			}
		}
		
		int[] result = new int[8];
		for (int i = 0 ; i < 8 ; i++) {
			if (((state >> i) & 1) > 0) {
				result[i] = 1;
			}
		}
		return result;
	}
	
	public int nextDay(int state) {
		int result = 0;
		
		for (int i = 1; i <= 6; i++) {
			if (((state >> (i - 1)) & 1) == ((state >> (i + 1)) & 1)) {
				result ^= (1 << i);
			}
		}
		
		return result;
	}

}
