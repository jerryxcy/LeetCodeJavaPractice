package org.leetcode.question;

import java.util.ArrayList;
//Kth Smallest Element in a BST
public class KthSmallestBST {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> items = kthSmallestInOrder(root, new ArrayList<Integer>());
		return items.get(k - 1);
	}
	
	//inorder traverse
	public ArrayList<Integer> kthSmallestInOrder(TreeNode root, ArrayList<Integer> arr) {
		if (root == null) {
			return arr;
		}
		kthSmallestInOrder(root.left, arr);
		arr.add(root.val);
		kthSmallestInOrder(root.right, arr);
		return arr;
	}
}
