package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.leetcode.question.june.InvertBinaryTree;

public class InvertBinaryTreeTest {

	@Test
	public void testMethod() {
		InvertBinaryTree.TreeNode node1 = new InvertBinaryTree.TreeNode(1);
		InvertBinaryTree.TreeNode node3 = new InvertBinaryTree.TreeNode(3);
		InvertBinaryTree.TreeNode node2 = new InvertBinaryTree.TreeNode(2);
		node2.left = node1;
		node2.right = node3;
		InvertBinaryTree.TreeNode node6 = new InvertBinaryTree.TreeNode(6);
		InvertBinaryTree.TreeNode node9 = new InvertBinaryTree.TreeNode(9);
		InvertBinaryTree.TreeNode node7 = new InvertBinaryTree.TreeNode(7);
		node7.left = node6;
		node7.right = node9;
		InvertBinaryTree.TreeNode node4 = new InvertBinaryTree.TreeNode(4);
		node4.left = node2;
		node4.right = node7;
		InvertBinaryTree tree = new InvertBinaryTree();
		InvertBinaryTree.TreeNode reverted = tree.invertTree(node4);
		assertEquals(4, reverted.val);
		assertEquals(7, reverted.left.val);
		assertEquals(2, reverted.right.val);
		assertEquals(9, reverted.left.left.val);
		assertEquals(6, reverted.left.right.val);
		assertEquals(3, reverted.right.left.val);
		assertEquals(1, reverted.right.right.val);
	}
}
