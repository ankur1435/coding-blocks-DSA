package Lec22;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		if ((n & 1) == 0) {
			// will check the last bit if last bit of n is 0 then number is even otherwise
			// odd
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
