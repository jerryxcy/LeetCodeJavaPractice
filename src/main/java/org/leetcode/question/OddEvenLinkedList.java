package org.leetcode.question;

public class OddEvenLinkedList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head;
		ListNode current = head.next;
		while (current != null && current.next != null) {
			ListNode tmp = pre.next;
			pre.next = current.next;
			current.next = current.next.next;
			pre.next.next = tmp;
			current = current.next;
			//the position of last odd
			pre = pre.next;
		}
		return head;
	}
}
