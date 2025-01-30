package Lec30;

public class Middle_of_the_Linked_List {

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
		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}
}

// fast != null: This ensures that the fast pointer itself is not null. If fast
// is null, accessing fast.next or fast.next.next would throw a
// NullPointerException.

// fast.next != null: This ensures that the fast pointer can safely move to
// fast.next.next. If fast.next is null, then fast.next.next would not be valid,
// and we avoid accessing it.
