package org.leetcode.question;

public class InvertBinaryTree {

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

	public TreeNode invertTree(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return root;
		}
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}
