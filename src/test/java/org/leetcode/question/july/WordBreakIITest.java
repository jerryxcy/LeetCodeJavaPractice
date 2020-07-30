package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordBreakIITest {

	@Test
	public void testMethod() {
		WordBreakII wordBreak = new WordBreakII();
		List<String> result = wordBreak.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
		assertEquals(true, result.contains("cats and dog"));
		assertEquals(true, result.contains("cat sand dog"));
	}
}
