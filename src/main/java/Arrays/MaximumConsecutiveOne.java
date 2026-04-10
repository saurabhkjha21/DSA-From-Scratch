//Max Consecutive Bit - GFG
//Time Complexity = O(n)
//Space Complexity = O(1)


class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int n = arr.length;
        int consecutive=1;
        int maxConsecutive=0;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                consecutive++;
            }
            else{
                maxConsecutive=Math.max(consecutive, maxConsecutive);
                consecutive=1;
            }
            
        }
        return Math.max(maxConsecutive, consecutive);
    }
}
