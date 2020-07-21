package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordSearchTest {

	@Test
	public void testMethod() {
		WordSearch ws = new WordSearch();
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertTrue(ws.exist(board, "ABCCED"));
		assertTrue(ws.exist(board, "SEE"));
		assertEquals(false, ws.exist(board, "ABCB"));
	}
}
