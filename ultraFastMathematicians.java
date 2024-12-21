import java.util.Scanner;

public class ultraFastMathematicians {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str1 = sc.next();
            String str2 = sc.next();

            String result = compare(str1, str2);
            System.out.println(result);
        }
    }

    public static String compare(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        return result.toString();
    }
}
