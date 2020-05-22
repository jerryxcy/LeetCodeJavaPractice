package org.leetcode.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharactersFrequency {

	public String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0 ; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		List<List<Character>> buckets = new ArrayList<List<Character>>();
		for (int i = 0 ; i < s.length()+1; i++) {
			buckets.add(new ArrayList<Character>());
		}
		for (Character c : map.keySet()) {
			int frequency = map.get(c);
			List<Character> chars = buckets.get(frequency);
			chars.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = buckets.size()-1; i >= 0 ; i--) {
			if (buckets.get(i) != null) {
				for (char c : buckets.get(i)) {
					for (int j = 0 ; j < i; j++) {
						sb.append(c);
					}
				}
			}
		}
		return sb.toString();
	}
}
