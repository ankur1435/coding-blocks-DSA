package Lec10;

public class Kadanes_Algo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maximumsum(arr));

	}

	public static int maximumsum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			// This line ensures that the ans variable always holds the maximum sum encountered up to that point in the array traversal
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}

// many thing would be useless if array is only filled up with positive numbers like if case
