package TwoPointers;

public class MaxSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {100, 200, 200, 300, 500, 100, 900};
        int k=2;
        int result = maxSubarrayOfSizeK(arr, k);
        System.out.println(result);

    }
    public static  int maxSubarrayOfSizeK(int[] arr, int k){
        int n=arr.length;
        int left=0;
        int sum=0, maxSum=Integer.MIN_VALUE;

        for(int right=0; right<n; right++){
            sum+=arr[right];
            int window=right-left+1; //This is the current window size; once it reaches k, we process it and then shrink the window..
            if(window==k){//here check the window size
                maxSum=Math.max(sum, maxSum);//compare sum
                sum-=arr[left];//remove the element from left
                left++;//move left forward
            }
        }
        return maxSum;

    }
}
