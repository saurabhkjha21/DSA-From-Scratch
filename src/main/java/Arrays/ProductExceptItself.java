//Product of Array Except Self
//Time Complexity = O(n)
//Space Complexity = O(1)


class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] res= new int[n];
        int pro=1;
        int proL=1;
        int proR=1;
        for(int i=0; i<n; i++){
            res[i]=proL;
            proL=proL*arr[i];
        }
        for(int i=n-1; i>=0; i--){
            res[i]=res[i]*proR;
            proR=proR*arr[i];
        }
        return res;
    }
}
