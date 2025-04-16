package Lec8;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 7, 9 };
		// int[] arr1 = new int[]{ 2, 3, 1, 7, 9 };
		// Java is call by value for primitive types.
		System.out.println(arr[0] + " " + arr[1]);
		SwapByReference(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	// call by reference
	public static void SwapByReference(int arr[], int i, int j) {// the array passed in the function is a reference to
																	// the main array because in java arrays are always
																	// passed by reference
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// call by value
	public static void SwapByValue(int a, int b) {// this will not work because A copy of x and y is sent to the
													// function.
		int temp = a;
		a = b;
		b = temp;
	}
}

// Call by Value: A copy of the actual data is passed to the function, so any
// changes made inside the function do not affect the original data.
// Call by Reference: The actual reference (memory address) of the data is
// passed, so changes made inside the function will affect the original data.

// you can swap primitive like int and float etc by making and object of a class
// like:

// class IntWrapper {
// int value;

// IntWrapper(int value) {
// this.value = value;
// }
// }

// public class SwapWithWrapper {
// public static void main(String[] args) {
// IntWrapper a = new IntWrapper(10);
// IntWrapper b = new IntWrapper(20);

// swap(a, b);

// System.out.println("a = " + a.value + ", b = " + b.value); // Output: a = 20,
// b = 10
// }

// public static void swap(IntWrapper x, IntWrapper y) {
// int temp = x.value;
// x.value = y.value;
// y.value = temp;
// }
// }
