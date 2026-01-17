package Strings;

import java.util.Scanner;

public class RotateArrayBasedOnStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = {1,2,3,4,5,6,7};
        int k = s.length();
        int n = arr.length;
        k=k%n;
        int left=0, right=k-1;
        rotateArray(arr, 0, n-1);//rotate whole array;
        rotateArray(arr,0, k-1);//rotate 0 to k-1;
        rotateArray(arr, k, n-1);//rotate remaining from k
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static int[] rotateArray(int[] arr, int left, int right){

        while(left<right){
            int temp = arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
        return arr;
    }
}
