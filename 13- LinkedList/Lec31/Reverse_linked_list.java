package Lec31;

public class Reverse_linked_list {
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
		public ListNode reverseList(ListNode head) {
			ListNode curr = head;
			ListNode prev = null;
			while (curr != null) {// while (curr.next != null) is incorrect because it skips the last node ❌
				ListNode ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			return prev;

		}
	}

}
