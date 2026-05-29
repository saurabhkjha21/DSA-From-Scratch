//Time Complexity=O(nlogn)
//Space Complexity=O(1)


class Solution {
    public int maximumProduct(int[] nums) {
        // int mul = Integer.MIN_VAlue;
        Arrays.sort(nums);


        return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
   
    }
}
//Step 1 : Sort the array
//Step 2 : multipliction of last three elements or first two and last one elements
