package org.leetcode.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> anagramsIndex = new ArrayList<Integer>();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0 ; i < p.length(); i++) {
			if (map.containsKey(p.charAt(i))) {
				map.put(p.charAt(i), map.get(p.charAt(i))+1);
			} else {
				map.put(p.charAt(i), 1);
			}
		}
		int left = 0, right = 0, count = p.length();
		char[] sCharArray = s.toCharArray();
		while (right < s.length()) {
			if (map.containsKey(sCharArray[right])) {
				if (map.get(sCharArray[right]) >= 1) {
					count--;
				}
				map.put(sCharArray[right], map.get(sCharArray[right])-1);
			}
			right++;
			if (count == 0) {
				anagramsIndex.add(left);
			}
			if ((right - left) == p.length()) {
				if (map.containsKey(sCharArray[left])) {
					if (map.get(sCharArray[left]) >= 0) {
						count++;
					}
					map.put(sCharArray[left], map.get(sCharArray[left])+1);
				}
				left++;
			}
		}
		return anagramsIndex;
	}
}
