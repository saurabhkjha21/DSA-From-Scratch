package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
        System.out.println(fib(n));
    }
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        // TC = O(2^n)

    }

    public static int fib(int n){
        if(n<=1) return n;
        int a=0, b=1;
        for(int i=2; i<=n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    //TC = O(n), SC=O(n)
}
