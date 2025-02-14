package Lec22;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 1, 2, 1, 2 };
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			// ^ is the sign of XOR operator when use XOR between two numbers the same
			// number gets cancel out and answer become 0 and use XOR between 0 and a number
			// n then answer will be that perticular number
			ans = ans ^ nums[i];
		}
		System.out.println(ans);
	}

}

// How XOR works
// 1 ^ 1 → 0 (same bits → 0)
// 0 ^ 0 → 0 (same bits → 0)
// 1 ^ 0 → 1 (different bits → 1)
// 0 ^ 1 → 1 (different bits → 1)
