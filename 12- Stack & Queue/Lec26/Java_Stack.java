package Lec26;

import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		// Default Capacity: When you create a Stack object without specifying a size,
		// Java assigns it an initial default capacity. This default capacity is
		// typically a small number (often 10).
		System.out.println(st.capacity());
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		// get
		System.out.println(st.peek());
		// remove
		System.out.println(st);// will print the values in the stack
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		// forin loop
		for (int v : st) {
			System.out.print(v + " ");
		}
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(50);
		st.push(50);
		System.out.println();
		System.out.println(st);
		System.out.println(st.capacity());
	}

}

// Capacity refers to the total number of elements the stack can hold before it
// needs to be resized.
// Size refers to the number of elements currently in the stack.
