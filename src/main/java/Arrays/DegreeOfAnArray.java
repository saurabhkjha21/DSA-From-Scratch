//697. Degree of an Array
//Time Complexity = O(n)
//Space Complexity = O(n)


class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();
        HashMap<Integer, Integer> frq = new HashMap<>();

        int degree =0;
        for(int i=0; i<nums.length; i++){
            if(!first.containsKey(nums[i])){
                first.put(nums[i], i);
            }

            last.put(nums[i], i);

            int count = frq.getOrDefault(nums[i], 0)+1;
            frq.put(nums[i], count);

            degree=Math.max(degree, count);
        }

        int ans = nums.length;

        for(int ele : frq.keySet()){
            if(frq.get(ele)==degree){
                ans=Math.min(ans, last.get(ele)-first.get(ele)+1);
            }
        }

        return ans;

    }
}
