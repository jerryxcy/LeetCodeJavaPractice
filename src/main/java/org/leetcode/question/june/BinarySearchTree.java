package org.leetcode.question.june;

import org.leetcode.common.TreeNode;

//Search in a Binary Search Tree
public class BinarySearchTree {

	public TreeNode searchBST(TreeNode root, int val) {
		while (root != null && root.val != val) {
			root = root.val > val ? root.left: root.right;
		}
		return root;
	}
}
