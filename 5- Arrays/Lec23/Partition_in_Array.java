package Lec23;

public class Partition_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		System.out.println(Partition(arr, 0, arr.length - 1));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int Partition(int[] arr, int si, int ei) {
		int val = arr[ei], idx = si;// idx is the pointer that tells: "Next spot to place a smaller element"
		for (int i = si; i < ei; i++) {
			if (arr[i] < val) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];// doing this becuase Everything before idx is smaller than pivot
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
	}
}

// We're looping and pushing all smaller elements to the left side, starting
// from si.

// idx tracks where the next smaller element should go.

// After the loop ends:

// idx is the first index where pivot should be placed.
