package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordBreakII {
	HashMap<String, List<String>> cache = new HashMap<>();
	
	public List<String> wordBreak(String s, List<String> wordDict) {
		if (cache.containsKey(s)) return cache.get(s);
		if (s.isEmpty()) return Arrays.asList("");
		List<String> result = new ArrayList<String>();
		for (String word: wordDict) {
			if (!word.equals(s.substring(0, word.length() > s.length()? s.length(): word.length()))) continue;
			String subString = word.length() == s.length() ? "": s.substring(word.length());
			List<String> subStringResult = wordBreak(subString, wordDict);
			for (String string: subStringResult) {
				result.add(word + (string.isEmpty() ? "": " ") + string);
			}
		}
		cache.put(s, result);
		return cache.get(s);
	}
}
