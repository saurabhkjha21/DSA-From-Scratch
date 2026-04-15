//2302. Count Subarrays With Score Less Than K - LeetCode
//Time Complexity = O(N)
??Space Complexity = O(1)


class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0;
        int left=0;
        long sum=0;
        for(int right=0; right<nums.length; right++){
            sum+=nums[right];
            while(sum*(right-left+1)>=k){
                sum-=nums[left];
                left++;
            }   
            count+=(right-left+1);    
        }
        return count;

    }
}
