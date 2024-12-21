import java.util.Scanner;

public class Replace_zero_with_five {
        public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = String.valueOf(N);
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                result += '5';
            } else {
                result += ch;
            }
        }
        int num = Integer.parseInt(result);
        System.out.print(num);
    }
}
