package Lec17;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		print(ques, "");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);// removes the first character (using substring(1))
		print(ques.substring(1), ans);
		print(ques.substring(1), ans + ch);

	}

}
