package org.leetcode.question.july;

import org.leetcode.common.TreeNode;

public class InPostOrderBinaryTree {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return buildTree(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder, int inorderLeft, int inorderRight, int postoderLeft, int postorderRight) {
		if (inorderLeft > inorderRight || postoderLeft > postorderRight) return null;
		TreeNode current = new TreeNode(postorder[postorderRight]);
		int i = 0;
		for (i = 0 ; i < inorder.length; i++) {
			if (inorder[i] == current.val) break;
		}
		current.left = buildTree(inorder, postorder, inorderLeft, i-1, postoderLeft, postoderLeft +i - inorderLeft -1);
		current.right = buildTree(inorder, postorder, i+1, inorderRight, postoderLeft + i -inorderLeft, postorderRight - 1);
		return current;
	}
}
