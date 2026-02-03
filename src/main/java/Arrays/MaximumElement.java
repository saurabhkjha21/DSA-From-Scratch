package Arrays;

import java.util.HashMap;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,2,2,1,1,1,1,3,1};
        int n = arr.length;
        int res1=max_elementA1(arr, n);
        System.out.println(res1);
        int res2 = max_elementA2(arr, n);
        System.out.println(res2);
    }
    /*
    TC=O(n)
    Sc=O(n)
     */
    public static int max_elementA1(int[] arr, int n){
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>n/2){
                return arr[i];
            }
        }
        return -1;
    }
    /*
    TC=O(n)
    SC=O(1)
     */
    public static int max_elementA2(int[] arr, int n){
        int candidate=0;
        int count=0;
        for(int i=0; i<n; i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0; i<n; i++){
            if(arr[i]==candidate) count1++;
        }
        if(count1>n/2) return candidate;
        return -1;
    }
}
