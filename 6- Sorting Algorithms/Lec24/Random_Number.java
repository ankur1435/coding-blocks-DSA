package Lec24;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si = 10;
		int ei = 100;
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {
			int x = rn.nextInt(ei - si + 1) + si;// his will generate a random integer from 0 to 99 (not 100!).
			System.out.println(x);
		}

	}

}
