package Lec28;

import java.util.Stack;

public class Stock_Span {
	public static void main(String[] args) {
		int[] arr = { 30, 35, 40, 38, 35 };
		Cal_Span(arr);
	}

	public static void Cal_Span(int arr[]) {
		Stack<Integer> st = new Stack<>();
		int ans[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				count += ans[st.pop()]; // count ko update karte rahna padega jab tak anne wala element pichhle wale se
										// chhota na ho jaye, jaise hi satisfy nahi hua condition simply jao aur count
										// ko uss in dex per paste kardo
			}

			ans[i] = count;
			st.push(i);
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
