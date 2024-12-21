import java.util.Scanner;

public class Odd_Even {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Odd_Even(N);
        Even_Odd(2,N);
    }
    public static void Odd_Even(int n){
        if(n == 0){
            return;
        } if(n % 2 != 0){
            System.out.println(n);
        }
        Odd_Even(n-1);
    }
    public static void Even_Odd(int curr, int max){
        if(max < curr){
            return;
        }
        System.out.println(curr);
        Even_Odd(curr+2,max);
    }
}
