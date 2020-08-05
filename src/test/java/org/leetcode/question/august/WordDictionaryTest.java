package org.leetcode.question.august;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordDictionaryTest {

	@Test
	public void testMethod() {
		WordDictionary dictionary = new WordDictionary();
		dictionary.addWord("bad");
		dictionary.addWord("dad");
		dictionary.addWord("mad");
		assertEquals(false, dictionary.search("pad"));
		assertEquals(true, dictionary.search("bad"));
		assertEquals(true, dictionary.search(".ad"));
		assertEquals(true, dictionary.search("b.."));
	}
}
