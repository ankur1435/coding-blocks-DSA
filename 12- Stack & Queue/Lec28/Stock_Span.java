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
			int count = 1; // Start count for current element

			// Pop elements while current price is greater
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				count += ans[st.pop()]; // Add spans of popped elements
			}

			ans[i] = count; // Store the span for current index
			st.push(i); // Push current index
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
