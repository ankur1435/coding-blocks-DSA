package Lec14;

public class String_Comparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2));// +ve s1>s2 | -ve s1<s2 | 0 s1==s2
		System.out.println(compareToStrings(s1, s2));// +ve s1>s2 | -ve s1<s2 | 0 s1==s2

	}

	public static int compareToStrings(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
				// This line is used to determine the lexicographical order of the two strings.
			}
		}
		return s1.length() - s2.length();
	}
}
