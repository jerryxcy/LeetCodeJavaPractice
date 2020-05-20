package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthSmallestBSTTest {

	@Test
	public void testMethod() {
		
		//root = [5,3,6,2,4,null,null,1], k = 3, output =3
		KthSmallestBST.TreeNode node1 = new KthSmallestBST.TreeNode(1, null, null);
		KthSmallestBST.TreeNode node2 = new KthSmallestBST.TreeNode(2, node1, null);
		KthSmallestBST.TreeNode node4 = new KthSmallestBST.TreeNode(4, null, null);
		KthSmallestBST.TreeNode node3 = new KthSmallestBST.TreeNode(3, node2, node4);
		KthSmallestBST.TreeNode node6 = new KthSmallestBST.TreeNode(6, null, null);
		KthSmallestBST.TreeNode node5 = new KthSmallestBST.TreeNode(5, node3, node6);
		KthSmallestBST kth = new KthSmallestBST();
		assertEquals(3, kth.kthSmallest(node5, 3));
	}
}
