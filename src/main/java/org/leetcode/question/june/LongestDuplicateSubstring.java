package org.leetcode.question.june;

import java.util.HashSet;
import java.util.Set;

public class LongestDuplicateSubstring {
	public String longestDupSubstring(String S) {
		int len = S.length();
		//convert char to num for Rabin-Karp
		int[] num = new int[len];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)S.charAt(i) - (int)'a';
		}
		
		int baseValue = 26;
		// modulus value for the rolling hash function to avoid overflow
		long modulus = (long)Math.pow(2, 32);
		
		int left = 1;
		int right = len;
		int duplicateLen  = 1;
		while (left != right) {
			duplicateLen = left + (right - left) / 2;
			if (search(duplicateLen, baseValue, modulus, len, num) != -1) {
				left = duplicateLen + 1;
			} else {
				right = duplicateLen;
			}
		}
		int start = search(left - 1, baseValue, modulus, len, num);
		return start != -1 ? S.substring(start, start + left - 1): "";
	}
	
	public int search(int duplicateLen, int baseValue, long modulus, int len, int[] num) {
		//compute the hash
		long hash = 0;
		for (int i = 0 ; i < duplicateLen; i++) {
			hash = (hash * baseValue + num[i]) % modulus;
		}
		
		Set<Long> seen = new HashSet<>();
		seen.add(hash);
		
		long baseValuehash = 1;
		for (int i = 1 ; i <= duplicateLen; i++) {
			baseValuehash = (baseValuehash * baseValue) % modulus;
		}
		
		for (int start = 1; start < len - duplicateLen + 1; start++) {
			//compute rolling hash
			hash = (hash * baseValue - num[start-1] * baseValuehash  % modulus + modulus) % modulus;
			hash = (hash + num[start + duplicateLen -1]) % modulus;
			if (seen.contains(hash)) {
				return start;
			}
			seen.add(hash);
		}
		
		return -1;
	}
}
