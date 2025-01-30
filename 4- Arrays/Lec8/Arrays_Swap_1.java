package Lec8;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 7, 9 };
		// int[] arr1 = new int[]{ 2, 3, 1, 7, 9 };
		System.out.println(arr[0] + " " + arr[1]);
		SwapByReference(arr, 0, 1); 
		System.out.println(arr[0] + " " + arr[1]);
	}

    // call by reference
	public static void SwapByReference(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// call by value
	public static void SwapByValue(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}

// Call by Value: A copy of the actual data is passed to the function, so any changes made inside the function do not affect the original data.
// Call by Reference: The actual reference (memory address) of the data is passed, so changes made inside the function will affect the original data.
