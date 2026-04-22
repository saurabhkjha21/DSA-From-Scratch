//Minimum Jumps -GFG
//Time Complexity =O(N)
//Space Complexity =O(1)


class Solution {
    public int minJumps(int[] arr) {
        // code here
        int max=0;
        int current=0;
        int jump=0;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max, arr[i]+i);
            if(i==current){
                jump++;
                current=max;
                
                if(current>=arr.length-1){
                    return jump;
                }
            }
        }
        return -1;
    }
}
