package LeetCodeJavaPractice;

import java.util.ArrayList;
import java.util.List;

//Implement Trie (Prefix Tree)
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
		for (int i = 0 ; i < word.length(); i++) {
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
		for (int i = 0 ; i < word.length(); i++) {
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

/**
 * Your Trie object will be instantiated and called as such: Trie obj = new
 * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
 * = obj.startsWith(prefix);
 */