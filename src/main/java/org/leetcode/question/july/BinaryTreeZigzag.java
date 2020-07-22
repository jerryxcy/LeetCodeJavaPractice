package org.leetcode.question.july;

import java.util.ArrayList;
import java.util.List;

import org.leetcode.common.TreeNode;

//Binary Tree Zigzag Level Order Traversal
public class BinaryTreeZigzag {
	List<List<Integer>> result = new ArrayList<>();
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		result = new ArrayList<>();
		dfs(root, 0);
		return result;
	}

	public void dfs(TreeNode node, int level) {
		if (node == null) return;
		if (result.size() <= level) {
			result.add(new ArrayList<>());
		}
		List<Integer> levelResult = result.get(level);
		if (level % 2 == 0) {
			levelResult.add(node.val);
		} else {
			levelResult.add(0, node.val);
		}
		dfs(node.left, level + 1);
		dfs(node.right, level + 1);
	}
}
