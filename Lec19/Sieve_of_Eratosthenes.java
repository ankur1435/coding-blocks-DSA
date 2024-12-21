package Lec19;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150;
		System.out.println(prime_sieve(n));

	}

	public static int prime_sieve(int n) {
		int[] arr = new int[n + 1];
		arr[0] = arr[1] = 1;// not prime; 
		for (int i = 2; i * i < arr.length; i++) {
			// if (arr[i] == 0) {
				for (int j = 2; i * j < arr.length; j++) {
					arr[i * j] = 1;
				}
			// }

		}
		int c = 0;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) {
				c++;
			}
		}
		return c;
	}

}
