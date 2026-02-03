package SortingAndSearching;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,0,9,4,2};
        int n = arr.length;
        bubble_sort(arr, n);
        System.out.println( "Bubble Sort: " +Arrays.toString(arr));

    }
    public static void bubble_sort(int[] arr, int n){

        for(int i=0; i<n-1; i++){
            boolean swapped =false;
            for(int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;

        }
        /*
        WC=O(n^2)
        AC=O(n^2)
        SC=O(1)
         */
    }
}
