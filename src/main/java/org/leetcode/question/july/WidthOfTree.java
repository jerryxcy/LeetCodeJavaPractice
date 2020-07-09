package org.leetcode.question.july;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.leetcode.common.TreeNode;

//Maximum Width of Binary Tree
public class WidthOfTree {

	public int widthOfBinaryTree(TreeNode root) {
		if (root == null) return 0;
		
		int maxWidth = 0;
		Queue<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
		//treenode => index
		queue.offer(new AbstractMap.SimpleEntry<>(root, 1));
		while (queue.size() > 0) {
			int leftIndex = queue.peek().getValue();
			int size = queue.size();
			int curIndex =  leftIndex;
			while (size > 0) {
				Map.Entry<TreeNode, Integer> curEntry  = queue.poll();
				curIndex = curEntry.getValue();
				TreeNode curTreeNode = curEntry.getKey();
				if (curTreeNode.left != null) {
					queue.add(new AbstractMap.SimpleEntry<>(curTreeNode.left, 2 * curIndex));
				}
				if (curTreeNode.right != null) {
					queue.add(new AbstractMap.SimpleEntry<>(curTreeNode.right, 2 * curIndex + 1));
				}
				size--;
			}
			maxWidth = Math.max(maxWidth, curIndex - leftIndex + 1);
		}
		return maxWidth;
	}

}
