//540. Single Element in a Sorted Array
//Time Complexity = O(logN)
//Space Complexity = O(1)


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo=0, hi=nums.length-1;
        int ans=-1;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            //make mid even
            if(mid%2==1){
                mid--;
            }
            //find valid or not
            if(nums[mid]==nums[mid+1]){
                lo=mid+2;//move left two steps
            }
            else{
                hi=mid;
            }


        }
        return nums[lo];
    }
}
