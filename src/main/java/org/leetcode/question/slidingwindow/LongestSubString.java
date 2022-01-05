package org.leetcode.question.slidingwindow;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */
public class LongestSubString {

	public int lengthOfLongestSubstring(String s) {
		//sliding window
		int result = 0;
		int left = -1;
		HashMap<Character, Integer> characterIndexMap = new HashMap<>() ;
		for (int i = 0 ; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (characterIndexMap.containsKey(ch) && characterIndexMap.get(ch) > left) {
				//e.g. abb, the left pointer move from -1 to 1
				left = characterIndexMap.get(ch);
			}
			characterIndexMap.put(ch, i);
			result = Math.max(result, i - left);
		}
		return result;
	}
}
