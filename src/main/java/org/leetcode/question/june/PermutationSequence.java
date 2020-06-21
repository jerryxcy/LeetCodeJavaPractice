package org.leetcode.question.june;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

	public String getPermutation(int n, int k) {
		StringBuilder result = new StringBuilder();
		//num list
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		
		int[] f = new int[n]; 
		for (int i = 0 ; i < n; i++) {
			f[i] = 1;
		}
		for (int i = 1; i < n; i++) {
			f[i] = f[i-1] * i;
		}
		
		k--;
		
		for (int i = n-1; i >=0 ; i--) {
			int j = k / f[i];
			k %= f[i];
			result.append(list.remove(j));
		}
		return result.toString();
	}

}
