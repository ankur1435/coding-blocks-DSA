package Lec18;

public class Boath_Path_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n" + Count(n, "", 0));

	}

	public static int Count(int n, String ans, int curr) {
		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		// int sum = 0;
		// for (int dice = 1; dice <= 3; dice++) {
		// 	sum += Count(n, ans + dice, curr + dice);
		// }
        int a = Count(n, ans + 1, curr + 1);
		int b = Count(n, ans + 2, curr + 2);
		int c = Count(n, ans + 3, curr + 3);
		return a + b + c;
	}

}
