package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ChecksDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3};
        int n = arr.length;
        boolean ans = checksDuplicateBF(arr, n);
        System.out.println(ans);


    }
    //TC=O(n^2), SC=O(1)
    public static boolean checksDuplicateBF(int[] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //TC=O(n) SC=O(n)
    public static boolean checksDuplicateBetter(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }

        return true;
    }
    // TC=O(n*log(n)) SC=O(1)
    public static boolean checkDuplicatesOptimal(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]) return true;
        }
        return false;
    }
}
