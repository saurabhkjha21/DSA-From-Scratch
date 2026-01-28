package Arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(arr[i], max);
        }
        System.out.println("Maximum Element: "+max);
    }
}
