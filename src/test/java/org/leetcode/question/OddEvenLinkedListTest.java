package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddEvenLinkedListTest {

	@Test
	public void testMethod() {
		OddEvenLinkedList.ListNode node5 = new OddEvenLinkedList.ListNode(5, null);
		OddEvenLinkedList.ListNode node4 = new OddEvenLinkedList.ListNode(4, node5);
		OddEvenLinkedList.ListNode node3 = new OddEvenLinkedList.ListNode(3, node4);
		OddEvenLinkedList.ListNode node2 = new OddEvenLinkedList.ListNode(2, node3);
		OddEvenLinkedList.ListNode node1 = new OddEvenLinkedList.ListNode(1, node2);
		OddEvenLinkedList.ListNode head = new OddEvenLinkedList().oddEvenList(node1);
		int[] expected = new int[] {1, 3, 5, 2, 4};
		OddEvenLinkedList.ListNode current = head;
		for (int i = 0 ; i < expected.length; i++) {
			System.out.println(current.val);
//			assertEquals(expected[i], current.val);
			current = current.next;
			if (i == expected.length-1) {
				assertEquals(null, current);
			}
		}
	}
}
