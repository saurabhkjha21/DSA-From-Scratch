package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        revArray(arr,0, arr.length-1);
        System.out.println(arr);
    }
    public static void  revArray(int[] arr,int start, int end){
        if(start>=end || arr==null) return;
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        revArray(arr, start+1, end-1);
    }

}
