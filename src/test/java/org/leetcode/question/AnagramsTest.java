package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AnagramsTest {

	@Test
	public void testMethod() {
		Anagrams anagrams = new Anagrams();
		List<Integer> indexs = anagrams.findAnagrams("cbaebabacd","abc");
		assertEquals(Arrays.asList(new Integer[]{0, 6}), indexs);
		
		indexs = anagrams.findAnagrams("abab", "ab");
		assertEquals(Arrays.asList(new Integer[]{0, 1, 2}), indexs);
		
		indexs = anagrams.findAnagrams("abab", "c");
		assertEquals(Arrays.asList(new Integer[]{}), indexs);

	}
}
