package org.leetcode.question.june;

import org.leetcode.common.TreeNode;

public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
		return root != null ? 1 + countNodes(root.left) + countNodes(root.right): 0;
	}
}
