package Lec6;

public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10101;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum += rem * mul;
			mul = mul * 2;
			n /= 10;
		}
		System.out.println(sum);
	}

}
