package SortingAndSearching;

import java.util.Arrays;

public class CountInversions {
    //inversion means -> i>j && arr[i]>arr[j]
    //TC = O(n^2)
    //SC = O(n)

    public static void main(String[] args) {
        int[] arr = {1,3,5,0,2,4};
        int left=0, right=arr.length-1;
        int count = mergeSort(arr, left, right);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
    public static int mergeSort(int[] arr, int left, int right){
        int count=0;
        if(left>=right) return 0;
        int mid = left + (right-left)/2;

        //mergeSort
        count+=mergeSort(arr, left, mid);//count inversions in left half
        count+= mergeSort(arr, mid+1, right);//count inversions in right half
        count+=merge(arr, left, mid,right);//count inversion during cross merge
        return count;


    }
    public static int merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int count=0;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++){
            L[i]=arr[left+i];
        }
        for(int j=0; j<n2; j++){
            R[j]=arr[mid+1+j];
        }
        int i=0, j=0, k=left;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];

            }
            else{
                arr[k++]=R[j++];
                count+=(n1-i);//inversions count
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while (j<n2){
            arr[k++]=R[j++];
        }
        return count;
    }

}
