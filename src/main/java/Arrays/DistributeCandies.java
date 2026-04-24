//575. Distribute Candies - LeetCode
//Time Complexity = O(n)
//Space Complexity = O(n)

class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int eat = n/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.size()==eat){
                break;
            }else{
                set.add(candyType[i]);
            }
        }
        return set.size();
    }
}
