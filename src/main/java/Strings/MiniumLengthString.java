//1750. Minimum Length of String After Deleting Similar Ends - LeetCode
//Time Complexity = O(N)
//Space Complexity = O(1)
class Solution {
    public int minimumLength(String s) {
        int left=0, right=s.length()-1;

        while(left < right && s.charAt(left)==s.charAt(right)){

            char ch = s.charAt(left);
            while(left<=right && s.charAt(left)==ch){
                left++;
            }
            while(left<=right && s.charAt(right)==ch){
                right--;
            }
        }
        return right-left+1;
    }
}
