import java.util.*;

public class Generate_paranthesis {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Parentheses(n, 0, 0, "");
	}

	public static void Parentheses(int n, int open, int closed, String ans) {
		if (open == n && closed == open) {
			System.out.println(ans);
			return;
		}
        if (closed < open) {
		    Parentheses(n, open, closed + 1, ans + ")");			
		}
        if (open < n) {
		    Parentheses(n, open + 1, closed, ans + "(");
		}

	}

}