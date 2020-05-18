package org.leetcode.question;

import java.util.HashMap;
import java.util.Map;

public class PermutationString {
	public boolean checkInclusion(String s1, String s2) {
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0 ; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		int left = 0, right = 0, count = s1.length();
		char[] sCharArray = s2.toCharArray();
		while (right < s2.length()) {
			if (map.containsKey(sCharArray[right])) {
				if (map.get(sCharArray[right]) >= 1) {
					count--;
				}
				map.put(sCharArray[right], map.get(sCharArray[right])-1);
			}
			right++;
			if (count == 0) {
				return true;
			}
			if ((right - left) == s1.length()) {
				if (map.containsKey(sCharArray[left])) {
					if (map.get(sCharArray[left]) >= 0) {
						count++;
					}
					map.put(sCharArray[left], map.get(sCharArray[left])+1);
				}
				left++;
			}
		}
		return false;
	}
}
