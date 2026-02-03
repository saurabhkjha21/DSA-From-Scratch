package SortingAndSearching;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,0,9,4,2};
        int n = arr.length;
        int[] ans= selection_sort(arr, n);
        System.out.println( "Bubble Sort: " + Arrays.toString(ans));

    }
    public static int[] selection_sort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int minIdx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
        }
        return arr;
        /*
        AC/BC/WC=O(n^2)
        SC=O(1)
         */
    }
}
