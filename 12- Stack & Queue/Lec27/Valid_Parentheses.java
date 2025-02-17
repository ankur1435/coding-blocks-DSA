package Lec27;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(Parentheses(s));

	}

	public static boolean Parentheses(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				// this check is here to know agar pahle se koi closing opening wala hai hi nahi
				// stack me jisse ham dhoodh rahe h qki hamare pass ak closing h stack me agar
				// koi opening nahi h to return false kardo
				if (st.isEmpty()) {
					return false;
				} else if (ch == ')' && st.peek() != '(') {
					return false;
				} else if (ch == '}' && st.peek() != '{') {
					return false;
				} else if (ch == ']' && st.peek() != '[') {
					return false;
				}

				st.pop();
			}
		}
		return st.isEmpty();

	}
}

// package Lec27;

// import java.util.Stack;

// public class Valid_Parentheses {

// public static void main(String[] args) {
// String s = "()[]{}";
// System.out.println(Parentheses(s));
// }

// public static boolean Parentheses(String s) {
// Stack<Character> st = new Stack<>();
// for (int i = 0; i < s.length(); i++) {
// char ch = s.charAt(i);
// if (ch == '(' || ch == '{' || ch == '[') {
// st.push(ch);
// } else {
// if (st.isEmpty()) {
// return false;
// } else if (ch == ')' && st.peek() == '(') {
// st.pop();
// return true;
// } else if (ch == '}' && st.peek() == '{') {
// st.pop();
// return true;
// } else if (ch == ']' && st.peek() == '[') {
// st.pop();
// return true;
// } else {
// return false;
// }
// }
// }
// return st.isEmpty();
// }
// }
