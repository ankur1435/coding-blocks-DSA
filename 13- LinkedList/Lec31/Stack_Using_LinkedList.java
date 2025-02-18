package Lec31;

import java.util.LinkedList;

public class Stack_Using_LinkedList {
	private LinkedList<Integer> ll = new LinkedList<>();

	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();// remove first
	}

	public int size() {
		return ll.size();
	}

	public int peek() {
		return ll.getFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// Deque<Integer> stack = new LinkedList<>(); here dequeue is been used because
// Deque can easily implement Stack operations.

// stack.push(10); // Adds 10 to the top
// stack.push(20); // Adds 20 to the top
// stack.push(30); // Adds 30 to the top

// System.out.println(stack.pop()); // Removes and prints 30
// System.out.println(stack.peek()); // Prints 20 (top element, but doesn’t
// remove)
