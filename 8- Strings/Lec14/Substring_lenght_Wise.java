package Lec14;

public class Substring_lenght_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		printallsubstring(s);
	} 

	public static void printallsubstring(String s) {
		for (int len = 1; len <= s.length(); len++) {
			// Controls the length of the substring being generated.
			for (int j = len; j <= s.length(); j++) {
				//Iterates through all valid substrings of the current length.
				int i = j - len;
				// The line int i = j - len calculates the starting index of the substring, ensuring the substring has the desired length len and ends at index j.
				System.out.println(s.substring(i, j));

			}
		}
	}

}
