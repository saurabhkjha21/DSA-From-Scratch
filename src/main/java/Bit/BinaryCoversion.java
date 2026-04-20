//Convert Integer to Binary, reverse it and convert back to integer - TCS
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n&1);
            n=n>>1;
        }
        sb.reverse();
        System.out.println(sb);
        int result=0;
        for(int i=sb.length()-1; i>=0; i--){
            result= result*2 + (sb.charAt(i)-'0');
        }
        System.out.print("Result: "+result);
    }
}
