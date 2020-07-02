package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.leetcode.common.TreeNode;

public class BinaryTreeLevelOrderTraversalII {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		levelTraversal(root, 0, result);
		Collections.reverse(result);
		return result;
	}

	public void levelTraversal(TreeNode node, int level, List<List<Integer>> result) {
		if (node == null) {
			return;
		}
		if (result.size() == level) {
			result.add(new ArrayList<Integer>());
		}
		result.get(level).add(node.val);
		if (node.left != null) {
			levelTraversal(node.left, level+1, result);
		}
		if (node.right != null) {
			levelTraversal(node.right, level+1, result);
		}
	}
}
