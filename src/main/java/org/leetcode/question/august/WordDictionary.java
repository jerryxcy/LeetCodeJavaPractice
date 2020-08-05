package org.leetcode.question.august;

public class WordDictionary {
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
	public WordDictionary() {
		root = new TrieNode();
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		if (word == null || word.length() == 0) {
			return;
		}
		TrieNode currentNode = root;
		for (int i = 0 ; i < word.length(); i++) {
			char c = word.charAt(i);
			if (currentNode.childrens[c - 'a'] == null) {
				currentNode.childrens[c - 'a'] = new TrieNode();
			}
			currentNode = currentNode.childrens[c - 'a'];
		}
		currentNode.isWord = true;
	}

	/**
	 * Returns if the word is in the data structure. A word could contain the dot
	 * character '.' to represent any one letter.
	 */
	public boolean search(String word) {
		return search(word, root, 0);
	}

	public boolean search(String word, TrieNode node, int i) {
		if (i == word.length()) return node.isWord;
		if (word.charAt(i) == '.') {
			for (TrieNode child: node.childrens) {
				if (child != null && search(word, child, i+1)) {
					return true;
				}
			}
			return false;
		} else {
			return node.childrens[word.charAt(i) - 'a'] != null && search(word, node.childrens[word.charAt(i) - 'a'], i+1);
		}
	}
}
