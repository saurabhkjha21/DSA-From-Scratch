//LeetCode - 509. Fibonacci Number
//Time Complexity = O(N)
//Space Complexity = O(1)

class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int prev2=0;
        int prev1=1;
        int cur=0;
        for(int i=2; i<=n; i++){
            cur=prev2+prev1;
            prev2=prev1;
            prev1=cur;
        }
        return prev1;

        
    }
}
