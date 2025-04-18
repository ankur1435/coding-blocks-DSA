// package Lec43;  

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int LCSBU(int[] arr1, int[] arr2) {
		int[][] dp = new int[arr1.length + 1][arr2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {

				if (arr1[i - 1] == arr2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int s1 = dp[i - 1][j];
					int s2 = dp[i][j - 1];
					dp[i][j] = Math.max(s1, s2);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
