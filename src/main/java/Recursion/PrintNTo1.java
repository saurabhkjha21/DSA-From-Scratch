package Recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Error");
            return;
        }
        printNToOne(n);


    }
    public static void printNToOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);

    }
}
