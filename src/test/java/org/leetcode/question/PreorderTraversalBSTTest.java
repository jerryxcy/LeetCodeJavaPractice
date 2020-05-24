package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PreorderTraversalBSTTest {
	
	@Test
	public void testMethod() {
		PreorderTraversalBST bst = new PreorderTraversalBST();
		PreorderTraversalBST.TreeNode root = bst.bstFromPreorder(new int[] {8,5,1,7,10,12});
		assertEquals(8, root.val);
		assertEquals(5, root.left.val);
		assertEquals(10, root.right.val);
		assertEquals(1, root.left.left.val);
		assertEquals(7, root.left.right.val);
		assertEquals(null, root.right.left);
		assertEquals(12, root.right.right.val);
	}
}
