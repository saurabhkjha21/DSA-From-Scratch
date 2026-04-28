//392. Is Subsequence - LeetCode
//Time Complexity= O(n+m)
//Space Complexity= O(n+m)

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0; 
        int j=0;

        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){ //if both characters are same
                i++;
                j++;
            }
            else{//only second pointer move to check
                j++;
            }
        }
        return (i==s.length()); //if 1st pointer is qual to s length
    }
}
