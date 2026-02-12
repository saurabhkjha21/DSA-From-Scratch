package Arrays;

import java.util.Arrays;

public class MergeAndSort {
    public static void main(String[] args){
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        System.out.println(Arrays.toString(mergeAndSort(arr1, arr2)));
    }
    //TC= O(n+m)
    //SC=O(n+m)
    public static int[] mergeAndSort(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;


        int[] result = new int[n+m];

        int i=0, j=0, k=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }
            else{
                result[k++]=arr2[j++];
            }
        }
        //if element are left in the array
        while(i<n){
            result[k++]=arr1[i++];
        }
        while(j<m){
            result[k++]=arr2[j++];
        }

        return result;

    }

}
