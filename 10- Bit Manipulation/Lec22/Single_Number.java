package Lec22;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 1, 2, 1, 2 };
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			// ^ is the sign of XOR operator
			ans = ans ^ nums[i];
		}
		System.out.println(ans);
	}

}

// How XOR works
// a ^ a = 0 → Same numbers cancel out.
// a ^ 0 = a → XOR with zero leaves the number unchanged.
// a ^ b ^ a = b → Order doesn't matter; identical pairs vanish.
