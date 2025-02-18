package Lec31;

import java.util.*;

public class Queue_Using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> ll = new LinkedList<>();
		// LinkedList is a class that implements the Queue interface. This means all
		// Queue operations are already defined in LinkedList.
		ll.add(10);// addlast--> Enqueue
		ll.add(20);// addlast
		ll.add(30);// addlast
		ll.add(40);// addlast
		ll.add(50);// addlast
		ll.remove();// remove first--> Dequeue
		ll.poll();// remove first-->Dequeue it is same a remove but it returns null if the queue
					// is empty, while remove() throws an exception.
		ll.peek();// get fornt but will not remove the element

	}

}

// Think of it like this:
// Queue<Integer> is like a remote control with only the buttons for queue
// operations.
// LinkedList<Integer> is the actual TV that stores and manages the data.
// Data is stored in a LinkedList.
// You access it using Queue operations.
