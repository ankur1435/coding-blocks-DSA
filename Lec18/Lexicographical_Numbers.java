package Lec18;

import java.util.*; 

 
public class Lexicographical_Numbers { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		List<Integer> ll = new ArrayList<>();
		Lexicographical(n, 0,ll);
		// System.out.println(ll);

	}

	public static void Lexicographical(int n, int curr,	List<Integer> ll) {
		// TODO Auto-generated method stub
		if (curr > n) {
			return;
		}
		if (curr != 0) {
			System.out.println(curr);
		}
		// ll.add(curr);

		for (int i = (curr == 0 ? 1 : 0); i <= 9; i++) {
			Lexicographical(n, curr * 10 + i,ll);
		}

	}

}
