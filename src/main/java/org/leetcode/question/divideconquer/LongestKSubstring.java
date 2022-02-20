package org.leetcode.question.divideconquer;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
 * 395. Longest Substring with At Least K Repeating Characters
 *
 */
public class LongestKSubstring {
	
	public int longestSubstring(String s, int k) {
		return longestSubstringDC(s, k, 0, s.length() - 1);
	}

	public int longestSubstringDC(String s, int k, int start, int end) {
		if (start > end)
			return 0;
		int[] characterCount = new int[26];
		Arrays.fill(characterCount, 0);
		for (int i = start; i <= end; i++) {
			characterCount[s.charAt(i) - 'a'] += 1;
		}
		for (int i = 0; i < 26; i++) {
			// find the character which doesn't meet the k as the point to divide and conquer
			if (characterCount[i] > 0 && characterCount[i] < k) {
				int pos = s.indexOf('a' + i, start);
				return Math.max(longestSubstringDC(s, k, start, pos - 1), longestSubstringDC(s, k, pos + 1, end));
			}
		}
		return end - start + 1;
	}
}
