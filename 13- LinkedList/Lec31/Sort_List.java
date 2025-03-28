package Lec31;

import Lec35.B;

public class Sort_List {
	public class ListNode {
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

	class Solution {
		public ListNode sortList(ListNode head) {
			// Base case: If the list is empty or has only one node, it's already sorted
			if (head == null || head.next == null) {
				return head;
			}
			// mid is the first half of the list: from head to mid.
			// headb is the second half: from mid.next onward.
			ListNode mid = middleNode(head);
			ListNode headb = mid.next;
			mid.next = null;
			// Recursion keeps dividing the list until each part has just one node.
			ListNode A = sortList(head);
			ListNode B = sortList(headb);
			return mergeTwoLists(A, B);
		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					Dummy.next = list1;
					list1 = list1.next;
					Dummy = Dummy.next;
				} else {
					Dummy.next = list2;
					list2 = list2.next;
					Dummy = Dummy.next;
				}
			}
			if (list1 != null) {
				Dummy.next = list1;
			}
			if (list2 != null) {
				Dummy.next = list2;
			}
			return temp.next;

		}

		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				// The loop continues only if both conditions are true
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}
}

// In summary: We divide the list, recursively sort the sublists, and then merge
// them back together in sorted order.