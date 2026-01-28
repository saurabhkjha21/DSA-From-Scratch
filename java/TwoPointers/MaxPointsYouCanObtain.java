package TwoPointers;

public class MaxPointsYouCanObtain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,1,2,4,66,7,7,8};
        int k=3;
        int result = max_point(arr, k);
        System.out.println(result);
    }
    public static int max_point(int[] arr, int k){
        int lSum=0, rSum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<k; i++){ //take sum of left to k
            lSum+=arr[i];
        }
        maxSum=lSum;
        int rIdx=arr.length-1;//last index of array
        for(int i=k-1; i>=0; i--){ //to pick element from right side
            lSum-=arr[i];//remove element from left
            rSum+=arr[rIdx];//add element from right
            rIdx--;//move backward from left
            maxSum=Math.max(maxSum, lSum+rSum);
        }
        return maxSum;
    }
}
