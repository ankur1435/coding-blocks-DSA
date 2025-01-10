package Lec14;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		// System.out.println(s.substring(2, 7));
		// System.out.println(s.substring(2));
		printallsubstring(s);
	}

	public static void printallsubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			// starting j = 1 will give me empty string on every loop because somewhere i == j and this is create s.substring(i,j)// s.substring(1,1);
			// if we start j = 0, a condition which is j <= i will falsed and this will create an issue and somewhere will give indexoutofbound error
			for (int j = i + 1; j <= s.length(); j++) {
				// running this loop till s.length() because we know that end index is exclusive to get all substrings we need that
				String str = s.substring(i, j);
				System.out.println(str);
			}
		} 
	}

}

// start (inclusive): The character at this index is included in the substring.
// end (exclusive): The character at this index is not included in the substring.

