package Lec28;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 5, 6, 2, 3 };
		System.out.println(largestArea(arr));
	}

	public static int largestArea(int[] heights) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for (int i = 0; i < heights.length; i++) {
			while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
				int h = heights[st.pop()];
				int r = i; // The right boundary (r) is the current index (i) because this is the point
							// where the bar can no longer extend.
				if (st.isEmpty()) {
					area = Math.max(area, h * r);
				} else {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				}
			}
			st.push(i);
		}
		int r = heights.length; // Since there is no right boundary for left elements, we assume their right
								// boundary extends to the end of the array
		while (!st.isEmpty()) {
			int h = heights[st.pop()];

			if (st.isEmpty()) {
				area = Math.max(area, h * r);
			} else {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			}
		}
		return area;

	}

}
