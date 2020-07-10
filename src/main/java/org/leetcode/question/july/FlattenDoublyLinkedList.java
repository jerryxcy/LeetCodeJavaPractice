package org.leetcode.question.july;

//Flatten a Multilevel Doubly Linked List
public class FlattenDoublyLinkedList {
	
	public static class Node {
		public int val;
		public Node prev;
		public Node next;
		public Node child;
	};
	
	public Node flatten(Node head) {
		Node cur = head;
		while (cur != null) {
			if (cur.child != null) {
				Node next = cur.next;
				//dfs
				cur.child = flatten(cur.child);
				//find the last of the child list
				Node last = cur.child;
				while (last.next != null) {
					last = last.next;
				}
				//connect to flatten child list's head
				cur.next = cur.child;
				cur.next.prev = cur;
				cur.child = null;
				//connect to the flatten child list's last 
				last.next = next;
				if (next != null) {
					next.prev = last;
				}
			}
			cur = cur.next;
		}
		return head;
	}
}
