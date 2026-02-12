package SortingAndSearching;

import java.util.Arrays;

public class DNF_SortColors {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,1,0};

        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] arr){
        int low=0, mid=0, high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[low++]=arr[mid];
                arr[mid++]=temp;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }
    }
}
