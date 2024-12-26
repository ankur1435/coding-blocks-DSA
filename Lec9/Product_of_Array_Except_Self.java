package Lec9;

public class Product_of_Array_Except_Self {
// by prefix product and suffix product
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int [] ans=Product(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] Product(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		int[] right = new int[n];
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];

		}
		for (int i = 0; i < right.length; i++) {
			left[i]=left[i]*right[i];
		}
		return left;
	}
}


// When you return arr from the function, you are returning a reference to the original array, so any changes made inside the function are directly reflected in the original array.

// However, when you return left or right, these are new arrays created inside the function. They are not the same as arr, so their reference needs to be explicitly stored in a new variable to access their values outside the function.
