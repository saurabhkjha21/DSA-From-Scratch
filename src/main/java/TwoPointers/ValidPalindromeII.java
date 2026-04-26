//680. Valid Palindrome II - LeetCode
//Time Complexity = O(N)
//Space Complexity = O(1)
class Solution {
    public boolean validPalindrome(String s) {
        int lo=0, hi=s.length()-1;
        while(lo<hi){
            if(s.charAt(lo)==s.charAt(hi)){
                lo++;
                hi--;
            }
            else{
                return isPalindrome(s, lo+1, hi ) ||
                isPalindrome(s, lo, hi-1 );
            }
        }
        return true;


        
    }
    private boolean isPalindrome(String s, int lo, int hi){
        while(lo<hi){
            if(s.charAt(lo)==s.charAt(hi)){
                lo++;
                hi--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
