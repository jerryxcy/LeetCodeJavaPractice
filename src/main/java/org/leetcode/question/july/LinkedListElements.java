package org.leetcode.question.july;

import org.leetcode.common.ListNode;

//Remove Linked List Elements
public class LinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			if (cur.val == val) {
				if (pre == null) {
					head = cur.next;
				} else {
					pre.next = cur.next;
				}
			} else {
				pre = cur;
			}
			
			cur = cur.next;
		}
		return head;
	}
}
