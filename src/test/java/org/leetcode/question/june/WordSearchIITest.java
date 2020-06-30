package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class WordSearchIITest {

	@Test
	public void testMethod() {
		WordSearchII ws = new WordSearchII();
		char[][] board = new char[][] { { 'o', 'a', 'a', 'n' }, 
			{ 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = new String[] {"oath","pea","eat","rain"};
		List<String> result = ws.findWords(board, words);
		assertEquals(2, result.size());
		assertEquals(true, result.contains("eat"));
		assertEquals(true, result.contains("oath"));
	}
}
