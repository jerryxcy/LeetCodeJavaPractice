package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.leetcode.common.TreeNode;

public class SumRoottoLeafNumbersTest {

	@Test
	public void testMethod() {
		SumRoottoLeafNumbers sum = new SumRoottoLeafNumbers();
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode root = new TreeNode(1);
		root.left = node1;
		root.right = node2;
				
		assertEquals(25, sum.sumNumbers(root));
	}
}
