package org.leetcode.question;

// Construct Binary Search Tree from Preorder Traversal
public class PreorderTraversalBST {
	// Definition for a binary tree node.
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
		
		int index = 0;
		public TreeNode bstFromPreorder(int[] preorder) {
			if (preorder == null || preorder.length == 0) {
				return null;
			}
			return bstFromPreorderBuilder(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
		
		public TreeNode bstFromPreorderBuilder(int[] preorder, int min, int max) {
			if (index >= preorder.length) {
				return null;
			}
			int value = preorder[index];
			TreeNode root = null;
			if (value > min && value < max) {
				root = new TreeNode(value);
				index++;
				root.left = bstFromPreorderBuilder(preorder, min, value);
				root.right = bstFromPreorderBuilder(preorder, value, max);
			}
			return root;
		}
}
