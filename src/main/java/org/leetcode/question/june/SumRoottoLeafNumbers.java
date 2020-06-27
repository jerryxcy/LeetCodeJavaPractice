package org.leetcode.question.june;

import java.util.Stack;

import org.leetcode.common.TreeNode;
// question - Sum Root to Leaf Numbers
public class SumRoottoLeafNumbers {
	
	public int sumNumbers(TreeNode root) {
		int sum = 0;
		return dfs(root, sum);
	}
	
	public int dfs(TreeNode root, int sum) {
		if (root == null) return 0;
		
		sum = sum * 10 + root.val;
		if (root.left == null && root.right == null) return sum;
		
		return dfs(root.left, sum) + dfs(root.right, sum);
	}
	
	public int sumNumbers2(TreeNode root) {
		if (root == null) return 0;
		int result = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();
			stack.pop();
			
			if (node.left == null && node.right == null) {
				result += node.val;
			}
			
			if (node.right != null) {
				node.right.val += node.val * 10;
				stack.push(node.right);
			}
			
			if (node.left != null) {
				node.left.val += node.val * 10;
				stack.push(node.left);
			}
		}
		return result;
	}
}
