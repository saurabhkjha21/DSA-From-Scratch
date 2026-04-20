//TCS NQT
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter element: ");
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0){
                arr[i]=arr[i+1];
                count++;
            }
        }
        for(int i=N-count-1; i<N; i++){
            arr[i]=0;
        }
        System.out.println("New array");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
