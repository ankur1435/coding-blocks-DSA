package Lec22;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(INDEX(str));

	}

	public static int INDEX(String str) {
		int n = str.length();
		int count = (1 << n) - 2;// n-1 digit tk ka saara count aagya
		int pos = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				// For every '7', if replaced by '4', it will generate all possible combinations of the remaining positions (to the right of the '7'). So, we need to add 2^pos to the count.
				count = count + (1 << pos);
			}
			pos++;
		}
		return count + 1;
	}
}



// Every time you encounter a '7', you count how many smaller combinations could be generated if that '7' were '4'.
// This will give you the index - 1 of the position of that string.
