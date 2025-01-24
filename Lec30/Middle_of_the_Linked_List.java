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

	public static void main(String[] args) {
		Middle_of_the_Linked_List obj = new Middle_of_the_Linked_List();
		Solution solution = obj.new Solution();

		// Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = obj.new ListNode(1);
		head.next = obj.new ListNode(2);
		head.next.next = obj.new ListNode(3);
		head.next.next.next = obj.new ListNode(4);
		head.next.next.next.next = obj.new ListNode(5);

		ListNode middle = solution.middleNode(head);

		System.out.println("The middle node is: " + middle.val);
	}

}
