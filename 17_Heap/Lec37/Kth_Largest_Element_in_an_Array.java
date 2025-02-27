package Lec37;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(Kth_Largest(nums, k));
	}

	public static int Kth_Largest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			if (nums[i] >= pq.peek()) {
				// This line ensures that the heap always contains the largest k elements.
				pq.poll();
				pq.add(nums[i]);
			}
		}
		return pq.peek();
	}
}

// Step-by-step explanation:
// pq.peek() gives the smallest element in the heap (because it's a Min Heap).
// If nums[i] (current element) is greater than pq.peek(), it means nums[i]
// should be in the top k largest elements.
// But the heap already has k elements, so we remove the smallest element
// (poll()).
// Then, we add nums[i] (add(nums[i])), ensuring that the heap always contains
// the k largest elements so far.