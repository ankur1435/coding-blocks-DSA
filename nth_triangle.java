import java.util.Scanner;

public class nth_triangle {
        public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        System.out.print(Triangular_Number(N,ans));
    }
    public static int Triangular_Number(int n, int ans){
        if(n == 0){
            return ans;
        }
        return Triangular_Number(n-1,ans+n);
    }
}
