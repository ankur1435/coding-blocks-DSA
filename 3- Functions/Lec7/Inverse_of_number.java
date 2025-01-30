package Lec7;

public class Inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int sum = 0;
		int place = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + (int) (place * Math.pow(10, rem - 1));
			n = n / 10;
			// the use of place is to keep track of the position of the digit in the original number
			place++;
		}
		System.out.println(sum);
	}

}
