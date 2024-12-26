package Lec9;

public class Revsersal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		// 1. reverse starting ke n-k element
		Reverse(arr, 0, n - 1 - k);// reverse this because we want to reverse the array from 0 to end and uske karan elements idhar udhar ho jayenge
		// 2. last ke K element
		Reverse(arr, k + 1, n - 1);// reverse this because k+1 se n-1 tak ke elements ko aage se dikhana hai aur agar reverse nahi karenge toh ulta dikhayega
		// 3. all element
		Reverse(arr, 0, n - 1);// apne second call ko dikhane ke liye ye call karna jaruri hai nahi to pichhe se dikhayega aur ye call kar rahe h issiliye pahle wala kar diye the taaki ye call karne ke baad sahi se dikhaye

	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
