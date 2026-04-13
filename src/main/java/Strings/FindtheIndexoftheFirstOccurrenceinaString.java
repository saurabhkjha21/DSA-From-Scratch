//28. Find the Index of the First Occurrence in a String - LeetCode
// Time Complexity = O(n-m)
//Space Complexity = O(m)
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i=0; i<=n-m; i++){
            if(haystack.substring(i, i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
