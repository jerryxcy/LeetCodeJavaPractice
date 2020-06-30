package org.leetcode.question.june;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Question - Word Search II
public class WordSearchII {
	class Trie {

		class TrieNode {
			boolean isWord;
			TrieNode[] childrens;

			public TrieNode() {
				isWord = false;
				childrens = new TrieNode[26];
			}
		}

		TrieNode root = null;

		/** Initialize your data structure here. */
		public Trie() {
			root = new TrieNode();
		}

		/** Inserts a word into the trie. */
		public void insert(String word) {
			if (word == null || word.length() == 0) {
				return;
			}
			TrieNode currentNode = root;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (currentNode.childrens[c - 'a'] == null) {
					currentNode.childrens[c - 'a'] = new TrieNode();
				}
				currentNode = currentNode.childrens[c - 'a'];
			}
			currentNode.isWord = true;
		}

		/** Returns if the word is in the trie. */
		public boolean search(String word) {
			if (word == null || word.length() == 0) {
				return false;
			}

			TrieNode currentNode = root;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (currentNode.childrens[c - 'a'] == null) {
					return false;
				}
				currentNode = currentNode.childrens[c - 'a'];
			}
			if (currentNode.isWord == true) {
				return true;
			}
			return false;
		}

		/**
		 * Returns if there is any word in the trie that starts with the given prefix.
		 */
		public boolean startsWith(String prefix) {
			if (prefix == null || prefix.length() == 0) {
				return false;
			}

			TrieNode currentNode = root;
			for (int i = 0; i < prefix.length(); i++) {
				char c = prefix.charAt(i);
				if (currentNode.childrens[c - 'a'] == null) {
					return false;
				}
				currentNode = currentNode.childrens[c - 'a'];
			}
			return true;
		}
	}
	
	Set<String> result = new HashSet<String>(); 
	
	public List<String> findWords(char[][] board, String[] words) {
		Trie trie = new Trie();
		for (String word: words) {
			trie.insert(word);
		}
		int m = board.length;
		int n = board[0].length;
		
		boolean[][] visisted = new boolean[m][n];
		for (int i = 0 ; i < m; i++) {
			for (int j = 0; j < n; j++) {
				visisted[i][j] = false;
			}
		}
		for (int i = 0 ; i < m; i++) {
			for (int j = 0; j < n; j++) {
				dfs(board, visisted, i, j, trie, "");
			}
		}
		return new ArrayList<String>(result);
	}

	public void dfs(char[][] board, boolean[][] visisted, int i, int j, Trie trie, String str) {
		int m = board.length;
		int n = board[0].length;
		
		if (i < 0 || j < 0 || i >=m || j >= n) {
			return;
		}
		
		if (visisted[i][j]) {
			return;
		}
		
		str = str + board[i][j];
		
		if (!trie.startsWith(str)) {
			return;
		}
		
		if (trie.search(str)) {
			result.add(str);
		}
		
		visisted[i][j] = true;
		dfs(board, visisted, i+1, j, trie, str);
		dfs(board, visisted, i, j+1, trie, str);
		dfs(board, visisted, i-1, j, trie, str);
		dfs(board, visisted, i, j-1, trie, str);
		visisted[i][j] = false;
	}
}
