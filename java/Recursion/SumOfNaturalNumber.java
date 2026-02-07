package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println("Sum Is: "+res);
    }
    public static int sum(int n){
        if(n==1) return 1;
        return n + sum(n-1);
    }
}
