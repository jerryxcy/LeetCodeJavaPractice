package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrieTest {

	@Test
	public void testMethod() {
		Trie trie = new Trie();
		trie.insert("apple");
		assertEquals(true, trie.search("apple"));
		assertEquals(false, trie.search("app"));
		assertEquals(true, trie.startsWith("app"));
	}
}
